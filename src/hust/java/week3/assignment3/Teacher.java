package hust.java.week3.assignment3;

import java.util.Scanner;

public class Teacher extends Person {

	private String teacherID;
	private String proSkill;
	
	private String[] teacherArray = new String[5];
	
	public String getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}
	
	public String getProSkill() {
		return proSkill;
	}
	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}
	
	public void createTeacher() {
		sc = new Scanner(System.in);
		System.out.print("Teacher ID: ");
		this.teacherID = sc.nextLine();
		createPerson();
		System.out.print("Pro Skill: ");
		this.proSkill = sc.nextLine();
		
		teacherArray[0] = getTeacherID();
		teacherArray[1] = getName();
		teacherArray[2] = Integer.toString(getAge());
		teacherArray[3] = getAddress();
		teacherArray[4] = getProSkill();
	}
	
	public String getTeacherName() {
		return getName();
	}
	
	public void displayTeacher() {
		System.out.println();
		System.out.println("Teaher ID: " + this.teacherArray[0]);
		System.out.println("Full Name: " + this.teacherArray[1]);
		System.out.println("Age: " + this.teacherArray[2]);
		System.out.println("Address: " + this.teacherArray[3]);
		System.out.println("Pro Skill: " + this.teacherArray[4]);
	}
	public String[] getTeacherArray() {
		return teacherArray;
	}
	
}
