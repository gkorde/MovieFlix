package io.egen.movieflix_server.exception;

public class EntityAlreadyExistsException extends RuntimeException {

	private static final long serialVersionUID = 7158462694399908128L;

	public EntityAlreadyExistsException(String message)	{
		super(message);
	}
	
	public EntityAlreadyExistsException(String message, Throwable cause)	{
		super(message, cause);
	}
}
