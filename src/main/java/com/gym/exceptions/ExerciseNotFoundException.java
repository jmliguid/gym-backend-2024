package com.gym.exceptions;

public class ExerciseNotFoundException extends RuntimeException { 

	public ExerciseNotFoundException(String message) {
		super(message);
	}
	
	public ExerciseNotFoundException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}
	
	public ExerciseNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}
	
	public ExerciseNotFoundException(Throwable arg0) {
		super(arg0);
	}
}
