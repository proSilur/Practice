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
       //Костыль убрал
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= lineNumber; j++) {
                if (j % 2 != 0) {
                    System.out.print("***");
                } else System.out.print("+++");
            }
            System.out.println();
        }
        scanner.close();
    }
}
