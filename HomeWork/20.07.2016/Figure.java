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
        StringBuilder builder = new StringBuilder();
        int length = scanner.nextInt();

        for (int i = 0; i < length * 2 - 1; i++) {
            if (i < length) System.out.print(builder.append("*") + "\n");
            else System.out.print(builder.deleteCharAt(0) + "\n");
        }
        scanner.close();
    }
}

