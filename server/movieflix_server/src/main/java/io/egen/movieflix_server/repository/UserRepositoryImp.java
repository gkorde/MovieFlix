package io.egen.movieflix_server.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.egen.movieflix_server.entity.User;

@Repository
public class UserRepositoryImp implements UserRepository {

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public User create(User usr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(User usr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(User usr) {
		// TODO Auto-generated method stub
		
	}



}
