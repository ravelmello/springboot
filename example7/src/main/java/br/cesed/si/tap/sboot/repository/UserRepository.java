package br.cesed.si.tap.sboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.cesed.si.tap.sboot.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

	public User findByName(String name);	
	
	
}
