package hust.java.week7.IOFiles;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// Nguon: http://android.vn/threads/bai-32-tim-hieu-ve-lop-file-trong-java.27786/

public class Bai32_ClassFile {

	private static Scanner sc;

	public static void main(String[] args) throws IOException {
		sc = new Scanner(System.in);
        String strFile;
        File checkDisk[];
        File f = new File("E:\\demoFile");
        System.out.print(f.getPath() + ">");
        boolean b = true;
        do {
             strFile = sc.nextLine();
             if (strFile.equalsIgnoreCase("C:") || strFile.equalsIgnoreCase("D:") || strFile.equalsIgnoreCase("E:")) {
                 f = new File(strFile + "\\");
                 System.out.print(f.getPath() + ">");
             } else if ((strFile.toLowerCase()).startsWith("cd")) {
                 checkDisk = f.listFiles();
                 boolean check = true;
                 for (int i = 0; i < checkDisk.length; i++) {
                    if (checkDisk[i].isDirectory() && strFile.compareToIgnoreCase("cd " + checkDisk[i].getName()) == 0) {
                        f = new File(checkDisk[i].getPath());
                        System.out.print("" + f.getPath() + ">");
                        check = true;
                        break;
                    } else
                         check = false;
               }
               if (!check) {
                      System.out.print("\nAccess is fail\n");
                      System.out.print("" + f.getPath() + ">");
               }
         } else if (strFile.compareToIgnoreCase("show") == 0) {
                  File f2 = new File(f.getPath());
                  do {
                        System.out.print("\n" + f2.getParent());
                        f2 = f2.getParentFile();
                        File list[] = f2.listFiles();
                        for (int i = 0; i < list.length; i++) {
                              System.out.print("\n-->" + list[i]);
                        }
                    } while (f2.getParent() != null);
                    System.out.print("\n" + f.getPath() + ">");
           } else if (strFile.compareToIgnoreCase("exit") == 0) {
                   b = false;
           } else if (strFile.toLowerCase().startsWith("makefile")) {
                   String sub = strFile.replace("makefile ", "");
                   f = new File(f, sub);
                   f.createNewFile();
                   System.out.print("" + f.getPath() + ">");
            } else {
                  System.out.println("'" + strFile + "' is not recognized as an internall or external command, operable program or batch file.");
                  System.out.print(f.getPath() + ">");
           }
     } while (b == true);
     System.out.println("Exit Application!!!");
 }
}
