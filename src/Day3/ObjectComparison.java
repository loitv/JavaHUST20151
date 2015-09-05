package Day3;

public class ObjectComparison {

	public static void main(String[] args) {
		AnyValue value1 = new AnyValue(1);
		AnyValue value2 = new AnyValue(1);
		System.out.println("Compare two objects:");
		System.out.println("value1 == value2: " + (value1 == value2));
		System.out.println("value1.equals(value2): " + (value1.equals(value2)));
		System.out.println("After assigning value2 to value1: ");
		value1 = value2;
		System.out.println("value1 == value2: "+ (value1 == value2));
		value1.setData(100);
		System.out.println("The data of value1: " + value1.getData());
		System.out.println("The data of value2: " + value2.getData());
	}
}
