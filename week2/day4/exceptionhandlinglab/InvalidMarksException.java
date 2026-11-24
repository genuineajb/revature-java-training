package week2.day4.exceptionhandling;

public class InvalidMarksException extends RuntimeException {
	public InvalidMarksException(String message) {
		super(message);
	}
}
