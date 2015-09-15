package hust.java.week3.inheritance1;

public class StudentManagement {

	public static void main(String[] args) {
		Person leme = new Person("Tran Van Loi", 22);
		leme.displayPerson();
		System.out.println("Loi is a person at HUST");
		String name = leme.getName();
		int age = leme.getAge();
		
		Student loi = new Student(name, age, "HUST");
		loi.displayStudent();
		System.out.println("Loi has passed Java Programming");
		loi.updateCredits(3);
		loi.displayStudent();
	}
}
