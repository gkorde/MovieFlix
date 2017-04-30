package io.egen.movieflix_server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.egen.movieflix_server.entity.Movie;
import io.egen.movieflix_server.exception.MovieAlreadyExistsException;
import io.egen.movieflix_server.exception.MovieNotFoundException;
import io.egen.movieflix_server.repository.MovieRepository;

@Service
public class MovieServiceImp implements MovieService {
	
	@Autowired
	MovieRepository repository;
	
	@Override
	public List<Movie> findAll() {
		return repository.findAll();
	}

	@Override
	public Movie findOne(String movieID) {
		Movie existing = repository.findOne(movieID);
		return existing;
	}

	@Override
	public List<Movie> findByYear(int year) {
		return repository.findByYear(year);
	}

	@Override
	public List<Movie> findByTitle(String name) {
		return repository.findByTitle(name);
	}

	@Override
	public List<Movie> findByGenre(String genre) {
		return repository.findByGenre(genre);
	}

	@Override
	public List<Movie> findByIMDBRating(float rating) {
		return repository.findByIMDBRating(rating);
	}

	@Override
	@Transactional
	public Movie create(Movie movie) {
		List<Movie> existing = repository.findByTitle(movie.getTitle());
		if (existing != null)	{
			for (Movie temp : existing)	{
				if (temp.getTitle().equals(movie.getTitle()))	{
					throw new MovieAlreadyExistsException(movie.getTitle() + "already exists in the database");
				}
					
			}
		}
		return repository.create(movie);
	}

	@Override
	@Transactional
	public Movie update(String movieID) {
		Movie existing = repository.findOne(movieID);
		if (existing == null){
			throw new MovieNotFoundException("Could not find any movie with the id:" +movieID);
		}
		return repository.update(existing);
	}
	
	@Override
	@Transactional
	public void delete(String movieID) {
		Movie existing = repository.findOne(movieID);
		if (existing == null)	{
			throw new MovieNotFoundException("Could not find any movie with the id:" +movieID);
		}
		repository.delete(existing);
	}
	
}
