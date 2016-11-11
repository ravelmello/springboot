package br.edu.facisa.cwf.example5.service;

import java.util.List;

import br.edu.facisa.cwf.example5.domain.User;

public interface UserService {

	User save(User user);

	User getById(String id);
	
	List<User> listAllUsers();
}
