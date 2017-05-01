package io.egen.movieflix_server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.egen.movieflix_server.entity.Comment;
import io.egen.movieflix_server.service.CommentService;

@RestController
@RequestMapping(path = "movies")
public class CommentController {

	@Autowired
	CommentService service;
	
	@RequestMapping(method = RequestMethod.POST, path = "{movieID}/comment/{userID}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Comment create(@PathVariable("movieID") String movieID, @PathVariable("userID") String userID, @RequestBody Comment comments) {
		return service.create(movieID, userID, comments);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "{movieID}/comments", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Comment> findByTitle(@PathVariable("movieID") String movieID) {
		return service.findByTitle(movieID);
	}
}
