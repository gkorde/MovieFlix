package io.egen.movieflix_server.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.egen.movieflix_server.entity.Comment;

@Repository
public class CommentRepositoryImp implements CommentRepository{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Comment> findByTitle(String movieID) {
		TypedQuery<Comment> query = em.createNamedQuery("Comment.findComments", Comment.class); 
		query.setParameter("pMovieID", movieID);
		return query.getResultList();
	}
	
	@Transactional
	@Override
	public Comment create(Comment comment) {
		em.persist(comment);
		return comment;
	}

}
