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

        //Реализация сложно читаемая но зато в одну строку, не понятно в чем тут "безобразие"
        System.out.println("Maximum value is: " + ((((a > b) ? a : b) > ((c > d) ? c : d)) ? ((a > b) ? a : b) : ((c > d) ? c : d)));

        /* Можно переприсвоением :
        int max = (a >= b) ? a : b;
        max = (max >= c) ? max : c;
        max = (max >= d) ? max : d;
        System.out.println(max);
         */

        /* Можно пебором :
        if (a >= b && a >= c && a >= d) {
            System.out.println(a);
        } else if (b >= a && b >= c && b >= d) {
            System.out.println(b);
        } else if (c >= a && c >= b && c >= d) {
            System.out.println(b);
        } else System.out.println(d);
         */

        /* Можно через метод (по такому принципу и сделано в одну строку):
        System.out.println(max(max(a, b), max(c, d)));
         */

        /* Можно переприсвоением через массив:
        int array[] = {a, b, c, d};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
        }
        System.out.println(max);
         */

        // И еще есть куча способов, просто захотелось сделать в одну строку.
        scanner.close();

    }
    static int max(int a, int b) {
        return (a >= b) ? a : b;
    }
}
