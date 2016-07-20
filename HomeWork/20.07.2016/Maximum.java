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

        //Экономим строки кода xD
        System.out.println("Maximum value is: " + ((((a >= b) ? a : b) >= ((c >= d) ? c : d)) ? ((a >= b) ? a : b) : ((c >= d) ? c : d)));
        scanner.close();
    }
}
