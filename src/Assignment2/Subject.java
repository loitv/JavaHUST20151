package Assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class Subject {

	private String subjectId;
	private String subjectName;
	private int subjectQuota;
	private int currentEnrolment;
//	private ArrayList sbjList;
	
//	public Subject(String initID, String initName, int initQuota, int initCurrentEnrolment) {
//		this.subjectId = new String(initID);
//		this.subjectName = new String(initName);
//		this.subjectQuota = initQuota;
//		this.currentEnrolment = initCurrentEnrolment;
//	}
	
	public void addSubject() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ma mon hoc: ");
		this.subjectId = sc.nextLine();
		System.out.print("Ten mon hoc: ");
		this.subjectName= sc.nextLine();
		System.out.print("So luong sinh vien toi da: ");
		this.subjectQuota = Integer.parseInt(sc.nextLine());
	}
	
	public void enrolStudent() {
		System.out.println("Enrol Student.");
		if (currentEnrolment < subjectQuota) {
			++currentEnrolment;
			System.out.println("Student enrolled in: " + subjectName);
		}
		else {
			System.out.println("Quota reached! Enrolment failed!");
		}
	}
	
	public void unEnrolStudent() {
		System.out.println("Un-Enrolling Student.");
		if (currentEnrolment <= 0) {
			System.out.println("No Student to Un-enrol");
		}
		else {
			--currentEnrolment;
			System.out.println("Student un-enrol from " + subjectName);
		}
	}
	
	public void displaySubjectInfo() {
//		System.out.println("Subject ID " + subjectId);
//		System.out.println("Subject Name " + subjectName);
//		System.out.println("Quota " + subjectQuota);
		System.out.println("Current Enrolment " + currentEnrolment);
		int availablePlaces = subjectQuota - currentEnrolment;
		System.out.println("Can appcept " + availablePlaces + " more students");
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
