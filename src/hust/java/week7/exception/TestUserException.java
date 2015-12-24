package hust.java.week7.exception;

public class TestUserException {

	private int number;
	public TestUserException(int num) throws InvalidCharacterException {
		if (num < 5) {
			throw(new InvalidCharacterException("Invalid number"));
		} else if (num > 10) {
			throw(new InvalidCharacterException());
		}
		this.number = num;
	}
	
	public int getNumber() {
		return number;
	}
	
	public static void main(String[] args) throws InvalidCharacterException {
		TestUserException tus = new TestUserException(11);
		System.out.println(tus);
	}
}
