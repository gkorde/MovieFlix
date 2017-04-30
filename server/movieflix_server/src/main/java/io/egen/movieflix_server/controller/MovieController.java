package io.egen.movieflix_server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.egen.movieflix_server.entity.Movie;
import io.egen.movieflix_server.service.MovieService;

@RestController
@RequestMapping(path = "movies")

public class MovieController {
	
	@Autowired
	MovieService service;
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movie> findAll()	{
		return service.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Movie findOne(@PathVariable("id") String movieID)	{
		return service.findOne(movieID);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "{Year}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movie> findByYear(@PathVariable("Year") int year)	{
		return service.findByYear(year);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "{title}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movie> findByTitle(@PathVariable("title") String name)	{
		return service.findByTitle(name);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "{genre}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movie> findByGenre(@PathVariable("genre") String genre)	{
		return service.findByGenre(genre);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "{IMDBRating}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movie> findByIMDBRating(@PathVariable("IMDBRating") float rating)	{
		return service.findByIMDBRating(rating);
	}
	
	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Movie create(@RequestBody Movie movie)	{
		return service.create(movie);
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Movie update(@PathVariable("id") String movieID)	{
		return service.update(movieID);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, path = "{id}")
	public void delete(@PathVariable("id") String movieID)	{
		service.delete(movieID);
	}
}
