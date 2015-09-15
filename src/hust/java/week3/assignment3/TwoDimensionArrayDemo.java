package hust.java.week3.assignment3;

public class TwoDimensionArrayDemo {

	public static void main(String[] args) {
		String[][] student = new String[10][2];
		student[0][0] = "Loi";
		student[0][1] = Integer.toString(22);
		student[1][0] = "Thao";
		student[1][1] = Integer.toString(21);
		
		int min = Integer.parseInt(student[0][1]);
		
		int[] storeIndex = new int[10];
		int count = 0;
		
		for (int i = 0; i < 2; i++) {
			min = Math.min(min, Integer.parseInt(student[i][1]));
		}
		for (int i = 0; i < 2; i++) {
			if (min == Integer.parseInt(student[i][1])) {
				storeIndex[count] = i;
				count++;
			}
		}
		
		System.out.println(count + " " + min);
		System.out.println(storeIndex[1]);
		
		for (int i = 0; i < count; i++) {
			System.out.println(student[storeIndex[i]][0]);
		}
		
		System.out.println(min);
		
	}
}
