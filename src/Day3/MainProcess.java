package Day3;

import java.util.Scanner;

public class MainProcess {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Subject sbj = new Subject("IT3650","Lap trinh Java",40, 0);
		String yn = "Y";
		boolean quit = false;

		sbj.setSubjectID("IT3650");
		sbj.setSubjectName("Lap trinh Java");
		sbj.setQuota(5);
		sbj.setCurrentEnrolment(0);

		while (!quit) {
			System.out.println("Dang ki mon hoc Lap trinh Java");
			System.out.println("1. Dang ki");
			System.out.println("2. Huy dang ki");
			System.out.println("3. Hien thi thong tin dang ki");
			System.out.println("4. Thoat");
			String str = sc.nextLine();
			int choose = Integer.parseInt(str);

			if (choose == 1) {
				do {
					sbj.enrolStudent();
					System.out.println("So sinh vien dang ki hien tai: " + sbj.getCurrentEnrolment());
					System.out.println("Do you want to continues (Y/N)?");
					yn = sc.nextLine();
				} while (yn.equalsIgnoreCase("Y"));
			} else if (choose == 2) {
				do {
					sbj.unEnrolStudent();
					System.out.println("So sinh vien da dang ki: " + sbj.getCurrentEnrolment());
					System.out.println("Do you want to continues (Y/N)?");
					yn = sc.nextLine();
				} while (yn.equalsIgnoreCase("Y"));
			} else if (choose == 3) {
				sbj.displaySubjectInfo();
				System.out.println();
			} else {
				quit = true;
			}
		}
	}
}
