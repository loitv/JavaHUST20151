package hust.java.week2.assignment2;

import java.util.Scanner;

public class Subject {

	private String subjectId;
	private String subjectName;
	private int subjectQuota;
	private int currentEnrolment;
	private Scanner sc;

	public void addSubject() {
		sc = new Scanner(System.in);
		System.out.print("Subject ID: ");
		this.subjectId = sc.nextLine();
		System.out.print("Subject Name: ");
		this.subjectName = sc.nextLine();
		System.out.print("Subject Quota: ");
		this.subjectQuota = Integer.parseInt(sc.nextLine());
	}

	public void enrolStudent() {
		int temp;
		System.out.print("Enter the number of students you want to enrol in this subject: ");
		do {
			sc = new Scanner(System.in);
			int numOfStu = Integer.parseInt(sc.nextLine());
			temp = currentEnrolment + numOfStu;
			if (temp > subjectQuota) {
				int a = subjectQuota - temp + numOfStu;
				System.out.println("Error! Only accept maximum " + a + " students more!");
				System.out.print("Please enter again: ");
			}
		} while (temp > subjectQuota);
		currentEnrolment = temp;
		displaySubjectInfo();
	}

	public void unEnrolStudent() {
		int temp;
		System.out.print("Enter the number of students you want to un-enrol in this subject: ");
		do {
			sc = new Scanner(System.in);
			int numOfStu = Integer.parseInt(sc.nextLine());
			temp = currentEnrolment - numOfStu;
			if (temp < 0) {
				System.out.println("Error! Only un-enrol maximum " + currentEnrolment + " students!");
				System.out.print("Please enter again: ");
			}
		} while (temp < 0);
		currentEnrolment = temp;
		displaySubjectInfo();
	}

	public void displaySubjectInfo() {
		System.out.println("Subject ID: " + subjectId);
		System.out.println("Subject Name: " + subjectName);
		System.out.println("Quota: " + subjectQuota);
		System.out.println("Current Enrolment: " + currentEnrolment);
		int availablePlaces = subjectQuota - currentEnrolment;
		System.out.println("Can accept " + availablePlaces + " more students.");
	}

	public void updateSubject() {
		sc = new Scanner(System.in);
		System.out.print("New subject ID: ");
		String newID = sc.nextLine();
		this.subjectId = newID;
		System.out.print("New subject name: ");
		String newName = sc.nextLine();
		this.subjectName = newName;
		System.out.print("New subject quota: ");
		int newQuota = Integer.parseInt(sc.nextLine());
		this.subjectQuota = newQuota;
	}

	public void moveStudent(Subject subject1, Subject subject2) {
		sc = new Scanner(System.in);
		int temp;
		System.out.print("Enter number of students you want to tranfer from suject1 to subject2: ");
		do {
			temp = Integer.parseInt(sc.nextLine());
			if (temp > subject1.currentEnrolment) {
				System.out.println("Only transfer maximum " + subject1.currentEnrolment + " students");
				System.out.print("Please enter again: ");
			}
		} while (temp > subject1.currentEnrolment);
		subject1.currentEnrolment = subject1.currentEnrolment - temp;
		subject2.currentEnrolment = subject2.currentEnrolment + temp;
	}

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectQuota() {
		return subjectQuota;
	}

	public void setSubjectQuota(int subjectQuota) {
		this.subjectQuota = subjectQuota;
	}

	public int getCurrentEnrolment() {
		return currentEnrolment;
	}

	public void setCurrentEnrolment(int currentEnrolment) {
		this.currentEnrolment = currentEnrolment;
	}
}
