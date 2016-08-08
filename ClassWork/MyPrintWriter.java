package Seventh;

import java.io.*;

public class MyPrintWriter {
    public static void main(String[] args) {
//        PrintWriter writer = new PrintWriter(System.out, true);
//        File file = new File("D:\\Disc\\Programming\\Java\\temp\\test.txt");
//        File file = new File("D:\\Disc\\Programming\\Java\\temp\\lol.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            System.out.println("Error!");
//        }

        File fileOne = new File("a.txt");

        try {
            fileOne.createNewFile();
        } catch (IOException e) {
            System.out.println(e);
        }

        File fileTwo = new File("c.txt");

        fileOne.renameTo(fileTwo);
        fileTwo.delete();


        File folder = new File("A");
        folder.mkdirs();

        File fileThree = new File(folder, "b.txt");
        try {
            fileThree.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        fileThree.delete();
        folder.delete();

        File file = new File(".");
        File[] fileArray = file.listFiles();
        for (File file1 : fileArray) {
            System.out.println(file1);
        }

        deleteFolder(new File("z"));
    }


    static void deleteFolder(File folder) {
        if (folder.isFile()) {
            folder.delete();
            return;
        }
        File[] filerArray = folder.listFiles();
        for (File file : filerArray) {
            deleteFolder(file);
        }
        folder.delete();
    }
}
