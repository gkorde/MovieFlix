package io.egen.movieflix_server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.egen.movieflix_server.entity.Comment;
import io.egen.movieflix_server.entity.Movie;
import io.egen.movieflix_server.entity.User;
import io.egen.movieflix_server.repository.CommentRepository;
import io.egen.movieflix_server.repository.MovieRepository;
import io.egen.movieflix_server.repository.UserRepository;

@Service
public class CommentServiceImp implements CommentService{
	
	
	@Autowired
	CommentRepository repository;
	
	@Autowired
	MovieRepository mrepository;
	
	@Autowired
	UserRepository urepository;
	
	@Override
	public Comment create(String movieID, String userID, Comment comments) {
		Movie movie = mrepository.findOne(movieID);
		User usr = urepository.findOne(userID);
		comments.setUsr(usr);
		comments.setMovie(movie);
		return repository.create(comments);
	}

	@Override
	public List<Comment> findByTitle(String movieID) {
		return repository.findByTitle(movieID);
	}

}
