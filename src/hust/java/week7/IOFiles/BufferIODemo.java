package hust.java.week7.IOFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferIODemo {

	public static void main(String[] args) {
		try (FileInputStream in = new FileInputStream("D:\\file.txt");
				FileOutputStream out = new FileOutputStream("D:\\file1.txt")) {
			int data;
			while (in.available() > 0) {
				data = in.read();
				out.flush();
				out.write(data);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
