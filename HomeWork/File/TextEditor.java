package Seventh;

/*
 1) Создайте консольный «текстовый редактор» с возможностью
 сохранения набранного текста в файл.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextEditor {
    public static void main(String[] args) {
        File file = new File("Text.txt");
        writeFile(file);
    }

    static void writeFile(File file) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        try (FileWriter writer = new FileWriter(file)) {
            while (true) {
                String text = scanner.nextLine();
                if (text.equals("q")) break;
                builder.append(text);
                builder.append(System.lineSeparator());
            }
            writer.write(String.valueOf(builder));
            scanner.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
