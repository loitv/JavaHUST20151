package hust.java.week3.inheritance1;

public class Person {

	private String name;
	private int age;
	private String profession;
	
	public Person(String initName, int initAge) {
		this.name = initName;
		this.age = initAge;
		this.profession = new String("Unemployed");
	}

	public void setProfession(String profession) {
		this.profession = new String(profession);
	}
	
	public void displayPerson() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Profession: " + profession);
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
