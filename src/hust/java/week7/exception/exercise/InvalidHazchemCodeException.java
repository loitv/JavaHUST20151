package hust.java.week7.exception.exercise;

public class InvalidHazchemCodeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8399537817534178719L;

	public InvalidHazchemCodeException() {
		super();
	}

	public InvalidHazchemCodeException(String inputHazchemCode) {
		super(inputHazchemCode);
	}

	public InvalidHazchemCodeException(Throwable cause) {
		super(cause);
	}

	public InvalidHazchemCodeException(String message, Throwable cause) {
		super(message, cause);
	}
}
