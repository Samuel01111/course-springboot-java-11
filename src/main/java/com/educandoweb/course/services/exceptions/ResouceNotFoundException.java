package com.educandoweb.course.services.exceptions;

public class ResouceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResouceNotFoundException(Object id) {
		super("Resource not found. Id " + id);
	}
}
