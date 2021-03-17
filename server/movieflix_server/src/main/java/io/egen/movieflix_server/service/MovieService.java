package io.egen.movieflix_server.service;

import java.util.List;

import io.egen.movieflix_server.entity.Movie;

public interface MovieService {
	
	public List<Movie> findAll();
	
	public Movie findOne(String movieID);
	
	public List<Movie> findByYear(int year);

	public List<Movie> findByTitle(String name);
	
	public List<Movie> findByGenre(String genre);
	
	public List<Movie> findByIMDBRating(float rating);
	
	public Movie create(Movie movie);
	
	public Movie update(String movieID);
	
	public void delete(String movieID);
	
}
