package hust.java.week3.inheritanceDemo;

import java.util.ArrayList;

public class InternCandidate extends Candidate {

	private String majors;
	private int semester;
	private String universityName;
	
	public String getMajors() {
		return majors;
	}
	public void setMajors(String majors) {
		this.majors = majors;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	
	public void createInternCandidate() {
		createCandidate();
		System.out.print("Major: ");
		this.majors = sc.nextLine();
		System.out.print("Semester: ");
		this.semester = Integer.parseInt(sc.nextLine());
		System.out.print("University Name: ");
		this.universityName = sc.nextLine();
	}
	
	public ArrayList<String> addIntCandToList(ArrayList<String> list) {
		addCandToList(list);
		list.add(this.majors);
		list.add(Integer.toString(this.semester));
		list.add(this.universityName);
		return list;
	}
}
