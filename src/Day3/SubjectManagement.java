package Day3;

import java.util.Scanner;

public class SubjectManagement {

	// private final int MAX_NUMBER_OF_SUBJECT = 20;

	public static void Dangky() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID mon hoc: ");
		String id = sc.nextLine();
		System.out.print("Ten mon hoc: ");
		String name = sc.nextLine();
		System.out.print("So luong sinh vien toi da: ");
		int quota = sc.nextInt();
		// subject = new Subject(id, name, quota, 0);
	}

	public static void main(String[] args) {
		// Subject javaProgramming = new Subject("IT3650", "Java Programming",
		// 40, 0);
		// javaProgramming.unEnrolStudent();
		// javaProgramming.displaySubjectInfo();
		// for (int i = 0; i <= 40; i++) {
		// System.out.println();
		// javaProgramming.enrolStudent();
		// javaProgramming.displaySubjectInfo();
		// System.out.println();
		// }

		// bai tap tren lop
		// Subject subject1 = new Subject(String subjectId, String subjectName,
		// int quota, int currentEnr);
		Scanner sc = new Scanner(System.in);
		String yn = "y";
		String id = null;
		String name = null;
		int quota = 0;
		System.out.println("-------Dang ky thong tin mon hoc:--------");

		do {
//			System.out.print("ID mon hoc: ");
//			id = sc.nextLine();
//			System.out.print("Ten mon hoc: ");
//			name = sc.nextLine();
//			System.out.print("So luong sinh vien toi da: ");
//			quota = sc.nextInt();
			SubjectManagement.Dangky();
			System.out.print("Ban co muon tiep tuc khong (y/n)? ");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));

		Subject subject1 = new Subject(id, name, quota, 0);
		subject1.unEnrolStudent();
		subject1.displaySubjectInfo();
		for (int i = 0; i <= quota; i++) {
			System.out.println();
			subject1.enrolStudent();
			subject1.displaySubjectInfo();
			System.out.println();
		}
	}
}
