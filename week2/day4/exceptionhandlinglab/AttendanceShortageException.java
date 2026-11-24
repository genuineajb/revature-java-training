package week2.day4.exceptionhandling;

public class AttendanceShortageException extends Exception {
	public AttendanceShortageException(String message) {
		super(message);
	}
}
