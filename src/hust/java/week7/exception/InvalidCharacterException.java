package hust.java.week7.exception;

public class InvalidCharacterException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7665566537425608096L;

	public InvalidCharacterException(String str) {
		super(str);
	}
	
	public InvalidCharacterException() {
		super();
	}

}
