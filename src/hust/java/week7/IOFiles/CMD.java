package hust.java.week7.IOFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

public class CMD {

	private static BufferedReader br;

	public static void main(String[] args) {
		try {
			String s;
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Bạn đang ở trình điều khiển cmd ổ đĩa E! \nNếu bạn muốn thoát, hãy nhập stop!");
			System.out.println("Bạn đang ở E:\\");
			String pathName = "E:";
			String temp;
			do {
				s = bf.readLine();

				if (s.startsWith("cd")) {
					temp = s.trim().substring(3);
					move(pathName, temp);
					pathName = pathName + "\\" + temp;
				} else if (s.startsWith("makeFile")) {
					temp = s.trim().substring(9);
					createFile(pathName, temp);
				} else if (s.startsWith("show")) {
					show(pathName);
				}

			} while (!s.equalsIgnoreCase("stop"));
		} catch (Exception ex) {
			System.out.println("Có lỗi xảy ra: " + ex);
		}
	}

	public static void createFile(String pathName, String fileName) {
		try {
			File file = new File(pathName, fileName);
			file.createNewFile();
			System.out.println("Thông báo: file " + file.getName() + " đã được tạo thành công!");

		} catch (Exception ex) {
			System.out.println("Đã xảy ra lỗi khi tạo!");
		}
	}

	public static void move(String pathName, String dirName) {
		try {
			String s = "";
			pathName = pathName + "\\" + dirName;
			File file = new File(pathName);
			if (file.isFile()) { // thuc hien mo file
				br = new BufferedReader(new FileReader(file));
				while ((s = br.readLine()) != null) {
					System.out.println(s);
				}
			}

		} catch (Exception ex) {
			System.out.println(dirName + " không tồn tại!");

		} finally {
			System.out.println("Bạn đang ở: " + pathName);
		}

	}

	public static void show(String pathName) {
		try {
			File dir = new File(pathName);
			if (dir.isFile()) {
				System.out.println(dir.getName() + " không phải là thư mục!");
			} else if (dir.isDirectory()) {
				File[] listFile = dir.listFiles();
				for (int i = 0; i < listFile.length; i++) {
					System.out.println("  " + i + ", " + listFile[i].getName());
				}
			}
		} catch (Exception ex) {
			System.out.println("Lỗi khi Show file! " + ex);
		}

	}
}
