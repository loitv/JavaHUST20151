package hust.java.week3.inheritanceDemo;

import java.util.ArrayList;

public class FresherCandidate extends Candidate {

	private int graduationDate;
	private String graduationRank;
	private String graduationUniversity;
	
	public int getGraduationDate() {
		return graduationDate;
	}
	public void setGraduationDate(int graduationDate) {
		this.graduationDate = graduationDate;
	}
	public String getGraduationRank() {
		return graduationRank;
	}
	public void setGraduationRank(String graduationRank) {
		this.graduationRank = graduationRank;
	}
	public String getGraduationUniversity() {
		return graduationUniversity;
	}
	public void setGraduationUniversity(String graduationUniversity) {
		this.graduationUniversity = graduationUniversity;
	}
	
	public void createFresCandidate() {
		createCandidate();
		this.setCandidateType(1);
		System.out.print("Graduation Year: ");
		this.graduationDate = Integer.parseInt(sc.nextLine());
		System.out.print("Graduation Rank: ");
		this.graduationRank = sc.nextLine();
		System.out.print("Graduation University: ");
		this.graduationUniversity = sc.nextLine();
	}
	
	public ArrayList<String> addFresCandToList(ArrayList<String> list) {
		addCandToList(list);
		list.add(Integer.toString(this.graduationDate));
		list.add(this.graduationRank);
		list.add(this.graduationUniversity);
		return list;
	}
	
}
