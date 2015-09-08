package Assignment2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Subject {

	private String subjectId;
	private String subjectName;
	private int subjectQuota;
	private int currentEnrolment;
	private Scanner sc;
	
	public void addSubject() {
		sc = new Scanner(System.in);
		System.out.print("Ma mon hoc: ");
		this.subjectId = sc.nextLine();
		System.out.print("Ten mon hoc: ");
		this.subjectName= sc.nextLine();
		System.out.print("So luong sinh vien toi da: ");
		this.subjectQuota = Integer.parseInt(sc.nextLine());
	}
	
	public void enrolStudent() {
		System.out.println("Enrol Student.");
		System.out.println("Nhan ENTER de thuc hien viec dang ky!");
		Scanner presskey = new Scanner(System.in);
		try {
			System.in.read();
		} catch(IOException e) {
			e.printStackTrace();
		}
		presskey.nextLine();
		
		if (currentEnrolment < subjectQuota) {
			++currentEnrolment;
//			displaySubjectInfo();
//			System.out.println("Da du SV! Dang ky khong thanh cong");
//			System.out.println("Student enrolled in: " + subjectName);
		}
		else {
			System.out.println("Da du SV! Dang ky khong thanh cong");
		}
	}
	
	public void unEnrolStudent() {
		System.out.println("Un-Enrolling Student.");
		if (currentEnrolment <= 0) {
			System.out.println("Huy dang ky loi!");
		}
		else {
			--currentEnrolment;
			System.out.println("Sinh vien huy dang ky mon: " + subjectName);
		}
	}
	
	public void displaySubjectInfo() {
//		System.out.println("Subject ID " + subjectId);
//		System.out.println("Subject Name " + subjectName);
//		System.out.println("Quota " + subjectQuota);
		System.out.println("So sinh vien da dang ky: " + currentEnrolment);
		int availablePlaces = subjectQuota - currentEnrolment;
		System.out.println("Co the dang ky them " + availablePlaces + " sinh vien nua.");
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
