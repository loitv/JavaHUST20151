package hust.java.week3.inheritanceDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static Scanner sc;
	private static ExperienceCandidate expCandidate;
	private static FresherCandidate fresCandidate;
	private static InternCandidate intCandidate;

	public static void main(String[] args) {
		
//		ArrayList candidateList = new ArrayList();
		ArrayList<String> experienceCandidate = new ArrayList<String>();
		ArrayList<String> fresherCandidate = new ArrayList<String>();
		ArrayList<String> internCandidate = new ArrayList<String>();
		
		System.out.println("CANDIDATE MANAGEMENT");
		System.out.println("1. Append new candidate");
		System.out.println("2. Display candidate's information");
		System.out.println("3. Quit");
		sc = new Scanner(System.in);
		int choose = Integer.parseInt(sc.nextLine());
		
		if (choose == 1) {
			System.out.println("---Append new candidate---");
			System.out.print("Type of candidate (0 = Experience; 1 = Fresher; 2 = Intern): ");
			int choose1 = Integer.parseInt(sc.nextLine());
			if (choose1 == 0) {
//				expCandidate.setCandidateType(0);
				expCandidate = new ExperienceCandidate();
				expCandidate.createExCandidate();
				experienceCandidate = expCandidate.addExpCandToList(experienceCandidate);
			}
			else if (choose1 == 1) {
//				fresCandidate.setCandidateType(1);
				fresCandidate = new FresherCandidate();
				fresCandidate.createFresCandidate();
				fresherCandidate = fresCandidate.addFresCandToList(fresherCandidate);
			}
			else if (choose1 == 2) {
				intCandidate.setCandidateType(2);
				intCandidate = new InternCandidate();
				intCandidate.createInternCandidate();
				internCandidate = intCandidate.addIntCandToList(internCandidate);
			}
			
			System.out.println(fresherCandidate);
		}
	}
}
