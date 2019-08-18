package com.example.demo.exception;

public class BoardException extends RuntimeException{
	
	private static final long serialVerisionUID = 1L;
	
	public BoardException(String message) {
		super(message);
	}
}
