package io.egen.movieflix_server.repository;

import java.util.List;

import io.egen.movieflix_server.entity.User;

public interface UserRepository {
	
		public List<User> findAll();
		
		public User findOne(String id);
		
		public User findByEmail(String email);
		
		public User create(User usr);
		
		public User update(User usr);
		
		public void delete(User usr); 
}
