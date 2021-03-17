package io.egen.movieflix_server.repository;

import java.util.List;

import io.egen.movieflix_server.entity.Comment;

public interface CommentRepository {

	public List<Comment> findByTitle(String movieID);
	
	public Comment create(Comment comment); 
}
