package hust.java.week3.inheritanceDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class Candidate {

	private String canID;
	private String firstName;
	private String lastName;
	private int birthDate;
	private int candidateType;
	protected Scanner sc;
	
	public String getCanID() {
		return canID;
	}
	public void setCanID(String canID) {
		this.canID = canID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}
	public int getCandidateType() {
		return candidateType;
	}
	public void setCandidateType(int candidateType) {
		this.candidateType = candidateType;
	}
	
	public void createCandidate() {
		sc = new Scanner(System.in);
		System.out.print("Candidate ID: ");
		this.canID = sc.nextLine();
		System.out.print("First Name: ");
		this.firstName = sc.nextLine();
		System.out.print("Last Name: ");
		this.lastName = sc.nextLine();
		System.out.print("Birth Date: ");
		this.birthDate = Integer.parseInt(sc.nextLine());
		
	}
	
	public void addCandToList(ArrayList<String> list) {
		list.add(this.canID);
		list.add(this.firstName);
		list.add(this.lastName);
		list.add(Integer.toString(this.birthDate));
		list.add(Integer.toString(this.candidateType));
	}
	
}
