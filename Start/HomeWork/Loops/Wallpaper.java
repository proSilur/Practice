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
        int lineNumber = scanner.nextInt();
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= lineNumber; j++) {
                System.out.print((j % 2 != 0) ? "***" : "+++");
            }
            System.out.println();
        }
        scanner.close();
    }
}
