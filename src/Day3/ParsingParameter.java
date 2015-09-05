package Day3;

public class ParsingParameter {

	// Method has primitive value
	private static void changeNumber(int a) {
		a = a + 1;
	}
	// Method has a reference value
	private static void changeValue(AnyValue value) {
		value.setData(10);
	}
	public static void main(String[] args) {
		//pass primitive parameter
		int number = 1;
		System.out.println("Before changing: Number = " + number);
		changeNumber(number);
		System.out.println("After changing: Number = " + number);
		
		//pass refernce parameter
		AnyValue value = new AnyValue(1);
		System.out.println("Before changing: value has " + value.getData());
		changeValue(value);
		System.out.println("After changinf: value has " + value.getData());
	}
}
