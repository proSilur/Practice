import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Created by Silur on 03.08.2016
 */
public class Read {
    public static void main(String[] args) {
        File file = new File("D:\\Progs\\Idea\\WorkWithFile\\src\\Read.java");
        String s = loadFromFile(file);
        System.out.println(s);
    }

    private static String loadFromFile(File file) {
        StringBuilder builder = new StringBuilder();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                builder.append(scanner.nextLine());
                builder.append(System.lineSeparator());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return builder.toString();
    }
}
