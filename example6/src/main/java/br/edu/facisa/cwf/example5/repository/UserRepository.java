package br.edu.facisa.cwf.example5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.facisa.cwf.example5.domain.User;

public interface UserRepository extends JpaRepository<User, String> {

	public User findByName(String name);
	
}
