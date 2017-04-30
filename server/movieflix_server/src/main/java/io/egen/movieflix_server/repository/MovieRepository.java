package io.egen.movieflix_server.repository;

import java.util.List;

import io.egen.movieflix_server.entity.Movie;

public interface MovieRepository {
	
	
	public List<Movie> findAll();
	
	public Movie findOne(String movieID);
	
	public List<Movie> findByYear(int year);
	
	public List<Movie> findByTitle(String name);
	
	public List<Movie> findByGenre(String genre);
	
	public List<Movie> findByIMDBRating(float rating);
	
	public Movie create(Movie movie);
	
	public Movie update(Movie movie);
	
	public void delete(Movie movie);
}
