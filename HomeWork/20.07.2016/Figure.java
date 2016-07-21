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
        System.out.println("Enter height of figure: ");
        int length = scanner.nextInt();
        int counter = 0;
        int counter2 = 0;

        //Вывод в консоль одним циклом
        //Чуть более чем полностью вывихнул моск, но вроди работает

        for (int i = 0; i < length * length; ) {
            counter2++;
            System.out.print("*");
            if (counter2 > length * length - 1) break;
            if (counter2 >= length + (length * length - length) / 2) {
                if (counter + 1 == length) {
                    System.out.println();
                    counter = i - counter + 1;
                    i++;
                } else {
                    counter++;
                }
            } else {
                if (i == counter) {
                    System.out.println();
                    counter = 0;
                    i++;
                } else {
                    counter++;
                }
            }
        }
        scanner.close();
    }

}
