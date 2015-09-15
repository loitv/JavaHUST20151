package hust.java.week3.inheritanceDemo;

import java.util.ArrayList;

public class ExperienceCandidate extends Candidate {

	private int expInYear;
	private String proSkill;
	
	public int getExpInYear() {
		return expInYear;
	}
	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}
	public String getProSkill() {
		return proSkill;
	}
	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}
	
	public void createExCandidate() {
		createCandidate();
		this.setCandidateType(0);
		System.out.print("Experience in years: ");
		this.expInYear = Integer.parseInt(sc.nextLine());
		System.out.print("Profesional Skill: ");
		this.proSkill = sc.nextLine();
	}
	
	public ArrayList<String> addExpCandToList(ArrayList<String> list) {
		addCandToList(list);
		list.add(Integer.toString(this.expInYear));
		list.add(this.proSkill);
		return list;
	}
	
}
