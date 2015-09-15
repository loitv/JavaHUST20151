package hust.java.week2.assignment2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static Scanner sc;
	private static Subject subject1;
	private static Subject subject2;
	
	public static void pressKey() {
		System.out.println("Press Enter to return main menu...");
		sc = new Scanner(System.in);
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.nextLine();
	}

	// START PROGRAM//
	public static void main(String[] args) {
		Subject subject = new Subject();
		sc = new Scanner(System.in);
		boolean quit = false;
		List<List<String>> subjectList = new ArrayList<List<String>>();

		while (!quit) {
			System.out.println("SUBJECT MANAGEMENT SYSTEM");
			System.out.println("--------------------------------------");
			System.out.println("1. Add new Subject");
			System.out.println("2. Update Subject");
			System.out.println("3. Display the information of Subject");
			System.out.println("4. Enrol new Student");
			System.out.println("5. Un-enrol student");
			System.out.println("6. Transfer student");
			System.out.print("Your choice (1-6, other to quit): ");

			int choose = Integer.parseInt(sc.nextLine());
			// 1. Them mon hoc
			if (choose == 1) {
				System.out.println("\n---Append new Subject---");
				for (int i = 0; i < 50; i++) {
					System.out.println("\nSubject " + (subjectList.size() + 1));
					subject.addSubject();
					// Them cac mon hoc da tao vao subjectList
					String subjectId = subject.getSubjectId();
					String subjectName = subject.getSubjectName();
					String subjectQuota = Integer.toString(subject.getSubjectQuota());
					String currEnr = "0";
					String[] temp = { subjectId, subjectName, subjectQuota, currEnr };
					List<String> tempList = new ArrayList<String>(Arrays.asList(temp));
					subjectList.add(tempList);

					System.out.print("Continue append (Y/N)? ");
					String yn = sc.nextLine();
					if (yn.equalsIgnoreCase("n")) {
						break;
					}
				}
				pressKey();
			}
			// 2. Chinh sua mon hoc
			else if (choose == 2) {
				System.out.println("\n---Update the Subject---\n");
				for (int count = 0; count < 50; count++) {

					String idSub = null, nameSub = null;
					int i;
					do {
						System.out.print("Enter ID of the subject: ");
						String enrSubj = sc.nextLine();
						for (i = 0; i < subjectList.size(); i++) {
							idSub = ((List<String>) subjectList.get(i)).get(0);
							nameSub = ((List<String>) subjectList.get(i)).get(1);
							if (enrSubj.equalsIgnoreCase(idSub)) {
								break;
							}
						}
						if (i == subjectList.size()) {
							System.out.println("Not found! Please enter again!");
						}
					} while (i == subjectList.size());

					Subject subject1 = new Subject();

					System.out.println("Found!");
					System.out.println("Update information of subject: " + nameSub);
					subject1.updateSubject();

					String newID = subject1.getSubjectId();
					String newName = subject1.getSubjectName();
					String newQuota = Integer.toString(subject1.getSubjectQuota());
					((List<String>) subjectList.get(i)).set(0, newID);
					((List<String>) subjectList.get(i)).set(1, newName);
					((List<String>) subjectList.get(i)).set(2, newQuota);

					System.out.print("Do you want to update more (Y/N)? ");
					String yn = sc.nextLine();
					if (yn.equalsIgnoreCase("n")) {
						break;
					}
				}
				pressKey();
			}
			// Hien thi thong tin mon hoc
			else if (choose == 3) {
				System.out.println("\n---Display the information of Subject---");
				for (int count = 0; count < 50; count++) {

					String idSub = null, nameSub = null;
					int i, quotaSub = 0, currEn = 0;
					do {
						System.out.print("Enter ID of the subject: ");
						String enrSubj = sc.nextLine();
						for (i = 0; i < subjectList.size(); i++) {
							idSub = ((List<String>) subjectList.get(i)).get(0);
							nameSub = ((List<String>) subjectList.get(i)).get(1);
							String quota = ((List<String>) subjectList.get(i)).get(2);
							quotaSub = Integer.parseInt(quota);
							String currEnr = ((List<String>) subjectList.get(i)).get(3);
							currEn = Integer.parseInt(currEnr);
							if (enrSubj.equalsIgnoreCase(idSub)) {
								break;
							}
						}
						if (i == subjectList.size()) {
							System.out.println("Not found! Please enter again!");
						}
					} while (i == subjectList.size());

					Subject subject1 = new Subject();
					subject1.setSubjectId(idSub);
					subject1.setSubjectName(nameSub);
					subject1.setSubjectQuota(quotaSub);
					subject1.setCurrentEnrolment(currEn);

					System.out.println("Found!");
					// Display the information of subject
					subject1.displaySubjectInfo();
					System.out.print("Do you want to search more (Y/N)? ");
					String yn = sc.nextLine();
					if (yn.equalsIgnoreCase("n")) {
						break;
					}
				}
				pressKey();
			}
			// Dang ky sinh vien
			else if (choose == 4) {
				System.out.println("\n---Enrol new student---\n");
				String idSub = null, nameSub = null;
				String ask = "y";
				int i, quotaSub = 0, currEn = 0;
				do {
					do {
						System.out.print("Enter ID of the subject: ");
						String enrSubj = sc.nextLine();
						for (i = 0; i < subjectList.size(); i++) {
							idSub = ((List<String>) subjectList.get(i)).get(0);
							nameSub = ((List<String>) subjectList.get(i)).get(1);
							String quota = ((List<String>) subjectList.get(i)).get(2);
							quotaSub = Integer.parseInt(quota);
							String currEnr = ((List<String>) subjectList.get(i)).get(3);
							currEn = Integer.parseInt(currEnr);
							if (enrSubj.equalsIgnoreCase(idSub)) {
								break;
							}
						}
						if (i == subjectList.size()) {
							System.out.println("Not found! Please enter again!");
						}
					} while (i == subjectList.size());
					System.out.println("Found!\nYou are enrolling in subject " + nameSub);
					String yn = "y";

					Subject subject2 = new Subject();
					subject2.setSubjectId(idSub);
					subject2.setSubjectName(nameSub);
					subject2.setSubjectQuota(quotaSub);
					subject2.setCurrentEnrolment(currEn);

					do {
						System.out.println("Subject Information: " + idSub + " " + nameSub + " " + quotaSub + " "
								+ subject2.getCurrentEnrolment());
						subject2.enrolStudent();
						System.out.print("Continue enrolling this subject(y/n)? ");
						yn = sc.nextLine();
					} while (yn.equalsIgnoreCase("y"));

					String currEnr = Integer.toString(subject2.getCurrentEnrolment());
					((List<String>) subjectList.get(i)).set(3, currEnr);
					System.out.print("Continue Enrolling? (y/n): ");
					ask = sc.nextLine();
				} while (ask.equalsIgnoreCase("y"));
				pressKey();

			}
			// Huy dang ky sinh vien
			else if (choose == 5) {
				System.out.println("\n---Un-enrol student---");
				String idSub = null, nameSub = null;
				String ask = "y";
				int i, quotaSub = 0, currEn = 0;
				do {
					do {
						System.out.print("Enter ID of the subject: ");
						String enrSubj = sc.nextLine();
						for (i = 0; i < subjectList.size(); i++) {
							idSub = ((List<String>) subjectList.get(i)).get(0);
							nameSub = ((List<String>) subjectList.get(i)).get(1);
							String quota = ((List<String>) subjectList.get(i)).get(2);
							quotaSub = Integer.parseInt(quota);
							String currEnr = ((List<String>) subjectList.get(i)).get(3);
							currEn = Integer.parseInt(currEnr);
							if (enrSubj.equalsIgnoreCase(idSub)) {
								break;
							}
						}
						if (i == subjectList.size()) {
							System.out.println("Not found! Please enter again!");
						}
					} while (i == subjectList.size());
					System.out.println("Found!\nYou are un-enrolling in subject " + nameSub);
					String yn = "y";

					Subject subject2 = new Subject();
					subject2.setSubjectId(idSub);
					subject2.setSubjectName(nameSub);
					subject2.setSubjectQuota(quotaSub);
					subject2.setCurrentEnrolment(currEn);

					do {
						System.out.println("Subject Information: " + idSub + " " + nameSub + " " + quotaSub + " "
								+ subject2.getCurrentEnrolment());
						subject2.unEnrolStudent();
						System.out.print("Continue un-enrolling this subject(y/n)? ");
						yn = sc.nextLine();
					} while (yn.equalsIgnoreCase("y"));

					String currEnr = Integer.toString(subject2.getCurrentEnrolment());
					((List<String>) subjectList.get(i)).set(3, currEnr);
					System.out.print("Continue Un-enrolling? (y/n): ");
					ask = sc.nextLine();
				} while (ask.equalsIgnoreCase("y"));

				pressKey();
			}

			else if (choose == 6) {
				System.out.println("\n---Transfer student---\n");
				String idSub = null, nameSub = null;
				int i, quotaSub = 0, currEn = 0;
				subject1 = new Subject();
				subject2 = new Subject();
				for (int count = 0; count < 2; count++) {
					do {
						System.out.print("Enter ID of subject " + (count + 1) + ": ");
						String enrSubj = sc.nextLine();
						for (i = 0; i < subjectList.size(); i++) {
							idSub = ((List<String>) subjectList.get(i)).get(0);
							nameSub = ((List<String>) subjectList.get(i)).get(1);
							String quota = ((List<String>) subjectList.get(i)).get(2);
							quotaSub = Integer.parseInt(quota);
							String currEnr = ((List<String>) subjectList.get(i)).get(3);
							currEn = Integer.parseInt(currEnr);
							if (enrSubj.equalsIgnoreCase(idSub)) {
								break;
							}
						}
						if (i == subjectList.size()) {
							System.out.println("Not found! Please enter again!");
						}
					} while (i == subjectList.size());
					if (count == 0) {
						subject1.setSubjectId(idSub);
						subject1.setSubjectName(nameSub);
						subject1.setSubjectQuota(quotaSub);
						subject1.setCurrentEnrolment(currEn);
					}
					if (count == 1) {
						subject2.setSubjectId(idSub);
						subject2.setSubjectName(nameSub);
						subject2.setSubjectQuota(quotaSub);
						subject2.setCurrentEnrolment(currEn);
					}
				}
				subject.moveStudent(subject1, subject2);
				System.out.println("\nInformaton of subjects after transfer:\n");
				subject1.displaySubjectInfo();
				System.out.println();
				subject2.displaySubjectInfo();
				System.out.println();
				pressKey();

			} else {
				quit = true;
			}
		}
	}
}