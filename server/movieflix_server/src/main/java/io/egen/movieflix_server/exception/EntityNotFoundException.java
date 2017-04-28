package io.egen.movieflix_server.exception;

public class EntityNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 7158462694399908128L;

	public EntityNotFoundException(String message)	{
		super(message);
	}
	
	public EntityNotFoundException(String message, Throwable cause)	{
		super(message, cause);
	}
}
