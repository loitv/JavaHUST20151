package hust.java.week11.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExamples {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("Item1");
		list.add("Item3");
		list.add(1, "Item2"); // Add Item3 to the second position of array list.
								// The other elements are pushed backward.
		list.add("Item4");

		// Display the contents of the array list
		System.out.println("The arraylist contains the following elements: " + list);
		// Checking index of an item
		int pos = list.indexOf("Item2");
		System.out.println("The index of Item2 is: " + pos);
		// Checking if array list is empty
		boolean check = list.isEmpty();
		System.out.println("Checking if the arraylist is empty: " + check);
		// Getting the size of the list
		int size = list.size();
		System.out.println("The size of the list is: " + size);

		// Checking if an element is included to the list
		boolean inList = list.contains("Item5");
		System.out.println("Checking if the arraylist contains the object Item5: " + inList);
		// Getting the element in a specific position
		String item = list.get(0);
		System.out.println("The item is the index 0 is: " + item);
		// Retrieve elements from the arraylist
		// 1st way: loop using index and size list
		System.out.println("Retrieving items with loop using index and size list");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Index: " + i + " - Item: " + list.get(i));
		}

		// 2nd way:using foreach loop
		System.out.println("Retrieving items using foreach loop");
		for (String str : list) {
			System.out.println("Item is: " + str);
		}
		// 3rd way:using iterator
		// hasNext(): returns true if there are more elements
		// next(): returns the next element
		System.out.println("Retrieving items using iterator");
		for (Iterator<String> i = list.iterator(); i.hasNext();) {
			System.out.println("Item is: " + i.next());
		}
		// Replacing an element
		list.set(1, "NewItem");
		System.out.println("The arraylist after the replacement is: " + list);
		// Removing items
		// removing the item in index 0
		list.remove(0);
		// removing the first occurrence of item "Item3"
		list.remove("Item3");
		System.out.println("The final contents of the arraylist are: " + list);
	}
}
