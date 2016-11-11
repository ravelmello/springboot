package br.edu.facisa.cwf.example5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.edu.facisa.cwf.example5.domain.User;
import br.edu.facisa.cwf.example5.service.UserService;
import br.edu.facisa.cwf.example5.service.exception.UserAlreadyExistsException;

@RestController
public class UserController {

	private final UserService userService;

	@Autowired
	public UserController(final UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value="/user", method = RequestMethod.GET)
	public ResponseEntity< List<User> > listAllUsers() {
		return new ResponseEntity< List<User> >
		(userService.listAllUsers(), HttpStatus.OK);
	}

	@RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
	public ResponseEntity<User> getUser(@PathVariable String id) {
		
		User user = userService.getById(id);
		
		return user == null ? 
				new ResponseEntity<User>(HttpStatus.NOT_FOUND) : 
					new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@RequestMapping(value="/user", method = RequestMethod.POST)
	public ResponseEntity<String> createUser(@RequestBody User user) {

		try {
			userService.save(user);
			return new ResponseEntity<String>(HttpStatus.CREATED);

		} catch (UserAlreadyExistsException e) {
			return new ResponseEntity<String>(HttpStatus.CONFLICT);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@ExceptionHandler
	@ResponseStatus(HttpStatus.CONFLICT)
	public String handleUserAlreadyExistsException(UserAlreadyExistsException e) {
		return e.getMessage();
	}

	public UserService getUserService() {
		return userService;
	}
}
