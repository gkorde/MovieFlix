package io.egen.movieflix_server.exception;

public class MovieAlreadyExistsException extends RuntimeException {

	private static final long serialVersionUID = 6806467431657599857L;
	
	public MovieAlreadyExistsException(String message)	{
		super(message);
	}
	
	public MovieAlreadyExistsException(String message, Throwable cause)	{
		super(message, cause);
	}
}
