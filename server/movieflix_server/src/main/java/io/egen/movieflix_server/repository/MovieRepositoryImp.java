package io.egen.movieflix_server.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import io.egen.movieflix_server.entity.Movie;

public class MovieRepositoryImp implements MovieRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Movie> findAll() {
		TypedQuery<Movie> query = em.createNamedQuery("Movie.findAll", Movie.class);
		return query.getResultList();
	}

	@Override
	public Movie findOne(String movieID) {
		return em.find(Movie.class, movieID);
	}

	@Override
	public List<Movie> findByYear(int year) {
		TypedQuery<Movie> query = em.createNamedQuery("Movie.findByYear", Movie.class);
		query.setParameter("pYear", year);
		return query.getResultList();
	}

	@Override
	public List<Movie> findByTitle(String name) {
		TypedQuery<Movie> query = em.createNamedQuery("Movie.findByTitle", Movie.class);
		query.setParameter("pTitle", name);
		return query.getResultList();
	}

	@Override
	public List<Movie> findByGenre(String genre) {
		TypedQuery<Movie> query = em.createNamedQuery("Movie.findByGenre", Movie.class);
		query.setParameter("pGenre", genre);
		return query.getResultList();
	}

	@Override
	public List<Movie> findByIMDBRating(float rating) {
		TypedQuery<Movie> query = em.createNamedQuery("Movie.findByIMDBRating", Movie.class);
		query.setParameter("pIMDBRating", rating);
		return query.getResultList();
	}

	@Override
	public Movie create(Movie movie) {
		em.persist(movie);
		return movie;
	}

	@Override
	public Movie update(Movie movie) {
		em.persist(movie);
		return movie;
	}
	
	@Override
	public void delete(Movie movie) {
		em.remove(movie);
	}

	

}
