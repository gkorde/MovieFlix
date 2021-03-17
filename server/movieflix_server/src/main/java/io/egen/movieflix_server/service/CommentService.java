package io.egen.movieflix_server.service;

import java.util.List;

import io.egen.movieflix_server.entity.Comment;

public interface CommentService {
	
	public Comment create(String movieID, String userID, Comment comments);
	
	public List<Comment> findByTitle(String movieID);
}
