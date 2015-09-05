package Assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainScreen {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List subjectList = new ArrayList(); // Luu danh sach cac mon hoc
		boolean quit = false;

		Subject sbj = new Subject();
		while (!quit) {
			System.out.println("----CHUONG TRINH QUAN LY MON HOC----");
			System.out.println("1. Quan ly mon hoc");
			System.out.println("2. Quan ly sinh vien dang ky mon hoc");
			System.out.println("3. Thoat");
			int choose;
			do {
				choose = Integer.parseInt(sc.nextLine());
				if (choose < 1 || choose > 3) {
					System.out.println("So khong hop le, xin moi nhap lai: ");
				}
			} while (choose < 1 || choose > 3);

			if (choose == 1) {
				int choose1;
				do {
					System.out.println();
					System.out.println("---QUAN LY MON HOC---");
					System.out.println("1. Them mon hoc");
					System.out.println("2. Chinh sua mon hoc");
					System.out.println("3. Hien thi danh sach cac mon hoc");
					System.out.println("4. Tro ve man hinh chinh");
					choose1 = Integer.parseInt(sc.nextLine());
					if (choose1 == 1) {
						System.out.println("--THEM MON HOC--");
						for (int i = 0; i < 20; i++) {
							System.out.println("\nMon hoc " + (i + 1));
							sbj.addSubject();
							// Them cac mon hoc da tao vao subjectList
							String subjectId = sbj.getSubjectId();
							String subjectName = sbj.getSubjectName();
							String subjectQuota = Integer.toString(sbj.getSubjectQuota());
							String[] temp = { subjectId, subjectName, subjectQuota };
							List<String> tempList = new ArrayList(Arrays.asList(temp));
							subjectList.add(tempList);

							System.out.print("Ban co muon tiep tuc khong (Y/N)? ");
							String yn = sc.nextLine();
							if (yn.equalsIgnoreCase("n")) {
								break;
							}
						}
					} else if (choose1 == 2) {
						System.out.println("--CHINH SUA MON HOC--");
						System.out.println();
					} else if (choose1 == 3) {
						System.out.println("\nDANH SACH CAC MON HOC DA DUOC TAO:");

						for (int i = 0; i < subjectList.size(); i++) {
							System.out.println((i + 1) + ".");
							for (int j = 0; j < 3; j++) {
								System.out.print(((List<String>) subjectList.get(i)).get(j) + "  ");
							}
							System.out.println();
						}
						System.out.println();
					}
				} while (choose1 != 4);
			}

			else if (choose == 2) {
				int choose2;

				System.out.println();
				System.out.println("---QUAN LY SINH VIEN DANG KY MON HOC---");
				System.out.println("1. Dang ky hoc");
				System.out.println("2. Huy dang ky");
				System.out.println("3. Chinh sua thong tin");
				System.out.println("4. Tro ve man hinh chinh");
				System.out.println();
				do {
					choose2 = Integer.parseInt(sc.nextLine());
					if (choose2 < 1 || choose2 > 4) {
						System.out.println("So khong hop le, xin moi nhap lai: ");
					}
				} while (choose2 < 1 || choose2 > 4);

				if (choose2 == 1) {
					System.out.println("\n--DANG KY HOC--");
					String idSub = null, nameSub = null;
					int i, quotaSub = 0;

					do {
						System.out.print("Nhap ma so (ID) cua mon hoc ban muon dang ky: ");
						String enrSubj = sc.nextLine();
						for (i = 0; i < subjectList.size(); i++) {
							idSub = ((List<String>) subjectList.get(i)).get(0);
							nameSub = ((List<String>) subjectList.get(i)).get(1);
							String quota = ((List<String>) subjectList.get(i)).get(2);
							quotaSub = Integer.parseInt(quota);
							if (enrSubj.equalsIgnoreCase(idSub)) {
								break;
							}
						}
						if (i == subjectList.size()) {
							System.out.println("Khong tim thay mon hoc! Moi thu lai");
						}
					} while (i == subjectList.size());
					System.out.println(idSub + " " + nameSub + " " + quotaSub);
					Subject subject1 = new Subject();
					subject1.setSubjectId(idSub);
					subject1.setSubjectName(nameSub);
					subject1.setSubjectQuota(quotaSub);
					int currentEnr = 0;
					subject1.setCurrentEnrolment(currentEnr);
					System.out.println("Dang ky mon hoc: " + nameSub);
					subject1.unEnrolStudent();
					subject1.displaySubjectInfo();
					for (int j = 0; j <= quotaSub; j++) {
						System.out.println();
						subject1.enrolStudent();
						subject1.displaySubjectInfo();
						System.out.println();
					}

				}

			} else {
				quit = true;
			}
		}
	}
}
