package br.edu.facisa.cwf.example2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping(value="/usuario", method = RequestMethod.GET)
	public String listarTodosUsuarios() {
		return "todos";
	}

	@RequestMapping(value="/usuario/{identificador}", method = RequestMethod.GET)
	public String obterInformacaoUsuario(@PathVariable(value="identificador") String id) {
		return "Ola, Meu Amigo Desenrolado que possui o ID = " + id;
	}
	
	@RequestMapping(value="/usuario", method = RequestMethod.POST)
	public String createParticipant(@RequestBody User user) {

		try {
			System.out.println(user);
			return "foi persistido o usuario " + user;

		} catch (Exception e) {
			return "problema";
		}
	}
}
