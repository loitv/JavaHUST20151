package Day3;

public class Subject {

	private String subjectID;
	private String subjectName;
	private int quota;
	private int currentEnrolment;
	
//	public Subject() {
//		this.quota = 80;
//	}
	public Subject(String initID, String initName, int initQuota, int initCurrentEnrolment) {
		this.subjectID = new String(initID);
		this.subjectName = new String(initName);
		this.quota = initQuota;
		this.currentEnrolment = initCurrentEnrolment;
	}
	//Generate getters and setters
	public String getSubjectID() {
		return subjectID;
	}
	public void setSubjectID(String subjectID) {
		this.subjectID = subjectID;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getQuota() {
		return quota;
	}
	public void setQuota(int quota) {
		this.quota = quota;
	}
	public int getCurrentEnrolment() {
		return currentEnrolment;
	}
	public void setCurrentEnrolment(int currentEnrolment) {
		this.currentEnrolment = currentEnrolment;
	}
	
	//Enrols student into course
	public void enrolStudent() {
		System.out.println("Enrol Student.");
		if (currentEnrolment < quota) {
			++currentEnrolment;
			System.out.println("Student enrolled in: " + subjectName);
		}
		else {
			System.out.println("Quota reached! Enrolment failed!");
		}
	}
	
	//Unenrols Student
	public void unEnrolStudent() {
		System.out.println("Un-Enrolling Student.");
		if (currentEnrolment <= 0) {
			System.out.println("No Student to Un-enrol");
		}
		else {
			--currentEnrolment;
			System.out.println("Student un-enrol from " + subjectName);
		}
	}
	
	//Display subject info
	public void displaySubjectInfo() {
		System.out.println("Subject ID " + subjectID);
		System.out.println("Subject Name " + subjectName);
		System.out.println("Quota " + quota);
		System.out.println("Current Enrolment " + currentEnrolment);
		int availablePlaces = quota - currentEnrolment;
		System.out.println("Can appcept " + availablePlaces + " more students");
	}
}

