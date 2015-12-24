package hust.java.week7.IOFiles;

import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
	public static void main(String args[]) {
		try (FileWriter wr = new FileWriter("D://test.txt"); ) {
			wr.write(String.valueOf(1));
			wr.write(":Nguyen Van An:");
			wr.write(String.valueOf(9.5));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
