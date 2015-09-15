package hust.java.week3.assignment3;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void pressKey() {
		System.out.println("Press Enter to continue...");
		sc = new Scanner(System.in);
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.nextLine();
	}

	//MAIN PROGRAM
	public static void main(String[] args) {
		
		Course course = new Course();
		System.out.println("Enter course information!");
		System.out.print("- Course Name: ");
		sc = new Scanner(System.in);
		course.setCourseName(sc.nextLine());
		System.out.println("- Add Teacher information: ");
		Teacher teacher = new Teacher();
		teacher.createTeacher();
		Student std = new Student();
		System.out.println("- Add new Student:");
		System.out.println("1. Manually");
		System.out.println("2. Automatically");
		int select = Integer.parseInt(sc.nextLine());
		if (select == 1) {
			std.createStudentManual();
		}
		else if (select == 2) {
			std.createStudentAutomatically();
			System.out.println("The program has just created 50 students!");
			pressKey();
		}

		boolean quit = false;
		while (!quit) {
			System.out.println("---COURSE MANAGEMENT---");
			System.out.println("1. Course Information");
			System.out.println("2. Teacher Information");
			System.out.println("3. Student Information");
			System.out.println("4. Quit");
			int choose = Integer.parseInt(sc.nextLine());
			if (choose == 1) {
				System.out.println("\nCourse Name: " + course.getCourseName());
				System.out.println("Teacher Name: " + teacher.getName());
				System.out.println("Number of Student: " + std.getEnrolStudent());
				pressKey();
			} else if (choose == 2) {
				teacher.displayTeacher();
				pressKey();
			} else if (choose == 3) {
				int choose1;
				do {
					System.out.println();
					System.out.println("1. Search Student");
					System.out.println("2. Display all students");
					System.out.println("3. Student has minmimum mark");
					System.out.println("4. Student has maximum mark");
					System.out.println("5. The List of student that has the decreasing mark");
					System.out.println("6. Return");
					choose1 = Integer.parseInt(sc.nextLine());
					if (choose1 == 1) {
						std.searchStudent();
//						pressKey();
					} else if (choose1 == 2) {
						std.displayAllStudent();
					} else if (choose1 == 3) {
						std.findMinMark();
						pressKey();
					} else if (choose1 == 4) {
						std.findMaxMark();
						pressKey();
					} else if (choose1 == 5) {
						std.decreasingMark();
						pressKey();
					}
				} while (choose1 != 6);
			} else {
				quit = true;
			}
		}
	}
}
