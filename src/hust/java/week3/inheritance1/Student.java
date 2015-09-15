package hust.java.week3.inheritance1;

public class Student extends Person {

	private String university;
	private int credits;
	
	public Student(String initName, int initAge, String initUniversity) {
		super(initName, initAge);
		super.setProfession("Student");
		this.university = initUniversity;
		this.credits = 0;
	}
	
	public void updateCredits(int moreCredit) {
		this.credits += moreCredit;
	}
	
	public void displayStudent() {
		super.displayPerson();
		System.out.println("University: " + this.university);
		System.out.println("Cumulated credits: " + this.credits);
	}
}
