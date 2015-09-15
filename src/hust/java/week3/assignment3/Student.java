package hust.java.week3.assignment3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Student extends Person {

	private String studentID;
	private int schoolYear;
	private int subjectMark;
	private int enrolStudent;
	private String[][] studentArray = new String[50][6];

	public String getStudentID() {
		return studentID;
	}
	public int getSchoolYear() {
		return schoolYear;
	}
	public void setSchoolYear(int schoolYear) {
		this.schoolYear = schoolYear;
	}
	public int getSubjectMark() {
		return subjectMark;
	}
	public int getEnrolStudent() {
		return this.enrolStudent;
	}
	public String[][] getStudentArray() {
		return studentArray;
	}

	////Method that create student manually 
	public void createStudentManual() {
		sc = new Scanner(System.in);
		for (int i = 0; i < 50; i++) {
			System.out.println("Student " + (this.enrolStudent + 1) + ":");
			System.out.print("Student ID: ");
			this.studentID = sc.nextLine();
			createPerson();
			System.out.print("School Year: ");
			this.schoolYear = Integer.parseInt(sc.nextLine());
			this.subjectMark = new Random().nextInt(6) + 5;

			studentArray[i][0] = getStudentID();
			studentArray[i][1] = getName();
			studentArray[i][2] = Integer.toString(getAge());
			studentArray[i][3] = getAddress();
			studentArray[i][4] = Integer.toString(getSchoolYear());
			studentArray[i][5] = Integer.toString(getSubjectMark());

			this.enrolStudent++;

			System.out.print("Do you want to continues (Y/N)? ");
			String yn = sc.nextLine();
			if (yn.equalsIgnoreCase("n")) {
				break;
			}
		}
	}

	//Method that create student Automatically 
	public void createStudentAutomatically() {
		//Create ID automatically
		String firstID = "st";
		String[] lastID = new String[50];
		for (int i = 0; i < 9; i++) {
			lastID[i] = "0".concat(Integer.toString(i + 1));
		}
		for (int i = 9; i < 50; i++) {
			lastID[i] = Integer.toString(i+1);
		}
		
		//Create Name Automatically
		String[] firstName = {"Tran ", "Nguyen ", "Pham ", "Le ", "Vu ", "Hoang ", "Duong ", "Ngo ", "Do ", "Bui "};
		String[] lastName = {"Tuan Anh", " Xuan Truong", "Cong Phuong", "Dong Trieu", "Van Toan",
				"Tien Thanh", "Tien Dung", "Xuan Thanh", "Hoang Thinh", "Trong Hoang", "Thanh Luong", "Huy Toan",
				"Cong Vinh", "Hien Thuc", "Huong Giang", "Quynh Huong", "Minh Hang", "Thu Hien", "Thuy Chi", "Hong Nhung",
				"My Linh", "Thanh Lam", "Thu Ha"};
		
		//Create Address
		String[] address = {"Bac Ninh", "Ha Noi", "Thanh Hoa", "Thai Binh", "Nghe An", "Da Nang", "Nam Dinh", "Hung Yen", "Lang Son", "Thai Nguyen"};
		
		String[] iD = new String[50];
		String[] name = new String[50];
		
		for (int i = 0; i < 50; i++) {
			iD[i] = firstID.concat(lastID[i]);
			studentArray[i][0] = iD[i];
			name[i] = (firstName[new Random().nextInt(firstName.length)]).concat(lastName[new Random().nextInt(lastName.length)]);
			studentArray[i][1] = name[i];
			studentArray[i][2] = Integer.toString(new Random().nextInt(6) + 20);
			studentArray[i][3] = address[new Random().nextInt(address.length)];
			studentArray[i][4] = "2011";
			studentArray[i][5] = Integer.toString(new Random().nextInt(6) + 5);
			this.enrolStudent++;
		}
	}
	
	//Method display one student
	public void displayStudent(int i) {
		System.out.println("Student ID: " + studentArray[i][0]);
		System.out.println("Student Name: " + studentArray[i][1]);
		System.out.println("Student Age: " + studentArray[i][2]);
		System.out.println("Student Address: " + studentArray[i][3]);
		System.out.println("Student School Year: " + studentArray[i][4]);
		System.out.println("Student Mark: " + studentArray[i][5]);
		System.out.println();
	}
	
	//Method display all student
	public void displayAllStudent() {
		System.out.println();
		for (int i = 0; i < enrolStudent; i++) {
			System.out.println((i + 1) + ". " + studentArray[i][0] + " " + studentArray[i][1]
					+ " " + studentArray[i][5]);
		}
	}

	//Method allows search student by ID
	public void searchStudent() {
		sc = new Scanner(System.in);
		int i;
		System.out.print("Enter Student ID: ");
		String search = sc.nextLine();
		for (i = 0; i < this.enrolStudent; i++) {
			if (search.equalsIgnoreCase(studentArray[i][0])) {
				System.out.println("Found!");
				displayStudent(i);
				break;
			}
		}
		if (i == this.enrolStudent) {
			System.out.println("Not Found!");
		}
	}

	//Method finds minimize mark and display students have that mark
	public void findMinMark() {
		sc = new Scanner(System.in);
		int minMark = Integer.parseInt(studentArray[0][5]);
		for (int i = 0; i < enrolStudent; i++) {
			minMark = Math.min(minMark, Integer.parseInt(studentArray[i][5]));
		}
		int count = 0;
		int[] storeIndex = new int[50];
		for (int i = 0; i < enrolStudent; i++) {
			if (minMark == Integer.parseInt(studentArray[i][5])) {
				storeIndex[count] = i;
				count++;
			}
		}
		System.out.println("Minimum mark is: " + minMark);
		System.out.println("There are " + count + " students have mark equals " + minMark + ", that are: ");
		for (int i = 0; i < count; i++) {
			System.out.println(studentArray[storeIndex[i]][1]);
		}
		System.out.println();
	}

	//Method finds maximize mark and display students have that mark
	public void findMaxMark() {
		sc = new Scanner(System.in);
		int maxMark = Integer.parseInt(studentArray[0][5]);
		for (int i = 0; i < enrolStudent; i++) {
			maxMark = Math.max(maxMark, Integer.parseInt(studentArray[i][5]));
		}
		int count = 0;
		int[] storeIndex = new int[50];
		for (int i = 0; i < enrolStudent; i++) {
			if (maxMark == Integer.parseInt(studentArray[i][5])) {
				storeIndex[count] = i;
				count++;
			}
		}
		System.out.println("Maximum mark is: " + maxMark);
		System.out.println("There are " + count + " students have mark equals " + maxMark + ", that are: ");
		for (int i = 0; i < count; i++) {
			System.out.println(studentArray[storeIndex[i]][1]);
		}
		System.out.println();
	}

	//Method defines "Selection Sort"
	public void sort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			int max = array[i]; // store maximum element
			int index = i; // store position of max element
			for (int j = i + 1; j < array.length; j++) {
				if (max < array[j]) {
					max = array[j];
					index = j;
				}
			}
			// Neu chi so da thay doi, ta se hoan vi
			if (index != i) {
				int temp = array[i];
				array[i] = array[index];
				array[index] = temp;
			}
		}
	}

	//Method that displays list of student by decreasing mark
	public void decreasingMark() {
		int[] mark = new int[this.enrolStudent];
		int[] markBeforeSort = new int[this.enrolStudent];
		int[] markAfterSort = new int[this.enrolStudent];
		for (int i = 0; i < this.enrolStudent; i++) {
			mark[i] = Integer.parseInt(studentArray[i][5]);
			markBeforeSort[i] = Integer.parseInt(studentArray[i][5]);
		}
		sort(mark);
		markAfterSort = mark;

		ArrayList<Integer> index = new ArrayList<Integer>();
		for (int i = 0; i < this.enrolStudent; i++) {
			if (i == 0) {
				for (int k = 0; k < this.enrolStudent; k++) {
					if (markAfterSort[0] == markBeforeSort[k]) {
						index.add(k);
					}
				}
			} else {
				if (mark[i] != mark[i - 1]) {
					for (int j = 0; j < this.enrolStudent; j++) {
						if (markAfterSort[i] == markBeforeSort[j]) {
							index.add(j);
						}
					}
				}
			}
		}
		System.out.println();
		System.out.println("The List of student that has the decreasing mark\n"
				+ "---------------------------------------------------");
		for (int i = 0; i < this.enrolStudent; i++) {
			System.out.println((i + 1) + ". " + studentArray[index.get(i)][0] + " " + studentArray[index.get(i)][1]
					+ " " + markAfterSort[i]);
		}
	}
}
