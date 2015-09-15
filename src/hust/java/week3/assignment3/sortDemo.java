package hust.java.week3.assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class sortDemo {

	// thuat toan selection sort, sap xep giam dan
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

	// Chuong trinh chinh
	public static void main(String[] args) {
		int[] mark = new int[10]; //luu diem thi cua sinh vien
		for (int i = 0; i < mark.length; i++) {
			int randMark = new Random().nextInt(6) + 5;
			mark[i] = randMark;
		}

		int[] markBeforeSort = new int[10]; //Diem truoc khi sap xep
		for (int i = 0; i < 10; i++) {
			markBeforeSort[i] = mark[i];
		}
		
		sortDemo sd = new sortDemo();
		sd.sort(mark);
		int[] markAfterSort = new int[10]; //Diem sau khi sap xep
		markAfterSort = mark;

		ArrayList<Integer> index = new ArrayList<Integer>(); //luu index cua tung diem truoc khi sap xep

		//Thuat toan tim index cua diem truoc va sau sap xep
		for (int i = 0; i < 10; i++) {
			if (i == 0) {
				for (int k = 0; k < 10; k++) {
					if (markAfterSort[0] == markBeforeSort[k]) {
						index.add(k);
					}
				}
			} else {
				if (mark[i] != mark[i - 1]) {
					for (int j = 0; j < 10; j++) {
						if (markAfterSort[i] == markBeforeSort[j]) {
							index.add(j);
						}
					}
				}
			}
		}
		System.out.println("Diem truoc khi sap xep: " + Arrays.toString(markBeforeSort));
		System.out.println("Diem sau khi sap xep:   " + Arrays.toString(markAfterSort));
		System.out.println("Index:                  " + index);
	}
}
