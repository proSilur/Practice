/*
    1) Написать программу которая считает 4 числа c клавиатуры и выведет на
       экран самое большое из них.
 */

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write first number and press Enter: ");
        int a = scanner.nextInt();
        System.out.println("Write second number and press Enter: ");
        int b = scanner.nextInt();
        System.out.println("Write third number and press Enter: ");
        int c = scanner.nextInt();
        System.out.println("Write fourth number and press Enter: ");
        int d = scanner.nextInt();

        System.out.print("Maximum value is: ");
        if (a > b && a > c && a > d) System.out.println(a);
        else if (b > a && b > c && b > d) System.out.println(b);
        else if (c > a && c > b && c > d) System.out.println(c);
        else if (d > a && d > b && d > c) System.out.println(d);
        scanner.close();

    }
}
