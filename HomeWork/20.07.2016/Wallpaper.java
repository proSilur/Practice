import java.util.Scanner;

/*
 3) С помощью циклов нарисовать «обои». Причем количество полос
    должно вводиться с клавиатуры. В примере 7 полос.
     ***+++***+++***+++***
     ***+++***+++***+++***
     ***+++***+++***+++***
     ***+++***+++***+++***
     ***+++***+++***+++***
 */
public class Wallpaper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write line number: ");
        int lineNumber = scanner.nextInt();
        String temp = "";

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < lineNumber; ) {
                temp = "***";
                System.out.print(temp);
                j++;
                if (lineNumber % 2 != 0 && j == lineNumber) break; // Костыль :)
                temp = "+++";
                j++;
                System.out.print(temp);
            }
            System.out.println();
        }
    }
}
