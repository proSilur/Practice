import java.util.Scanner;

/*
 3) С помощью цикла (только одного) нарисовать такую фигуру. Причем
 максимальная высота этой фигуры вводиться с клавиатуры (в примере
 максимальная высота - 4)
 *
 **
 ***
 ****
 ***
 **
 *

 */

public class Figure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        String temp = "";
        for (int i = 0; i < length * 2 - 1; i++) {
            temp += "*";
            System.out.print(temp + "\n");
        }

    }
}
