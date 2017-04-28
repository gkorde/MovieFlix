 package io.egen.movieflix_server.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.egen.movieflix_server.entity.User;
import io.egen.movieflix_server.exception.EntityAlreadyExistsException;
import io.egen.movieflix_server.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	UserRepository repository;
	
	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

	@Override
	public User findOne(String id) {
		User existing = repository.findOne(id);
		if (existing == null)	{
			throw new EntityNotFoundException("No user with id:" +id + "not found");
		}
		
		return existing;
	}

	@Override
	public User create(User usr) {
		User existing = repository.findByEmail(usr.getEmail());
		if (existing != null)	{
			throw new EntityAlreadyExistsException("Email is already in use: " + usr.getEmail());
		}
		
		return repository.create(usr);
	}

	@Override
	public User update(String id, User usr) {
		User existing = repository.findOne(id);
		if (existing == null)	{
			throw new EntityNotFoundException("No user with id:" +id + "not found");
		}
		
		return repository.update(usr);
	}

	@Override
	public void delete(String id) {
		User existing = repository.findOne(id);
		if (existing == null)	{
			throw new EntityNotFoundException("No user with id:" +id + "not found");
		}
		
		repository.delete(existing);
	}

}
