package hust.java.week3.inheritance;

public class Base {

	public String pubData;
	private String prvData;
	public Base() {
		System.out.println("Base");
		prvData = "private";
	}
	public String getPrvData() {
		return prvData;
	}
}
