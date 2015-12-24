package hust.java.week12.Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class NewClient {
	public static void main(String[] args) {
		try (Socket clientSocket = new Socket("localhost", 5000);
				BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
				ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream())) {
			while (true) {
				String id;
				System.out.println("Student's ID: ");
				id = user.readLine();
				if (id.length() == 0) {
					System.out.println("Stopped sending data to server!");
					break;
				}
				String name;
				System.out.println("Student's name: ");
				name = user.readLine();
				Student student = new Student(id, name);
				out.writeObject(student);
				out.flush();
			}
			clientSocket.close();
		} catch (IOException e) {
			System.out.println("Cannot connect to server!");
		}
	}
}