package Sixth;

import java.util.Scanner;

/*
 3) Ввести с консоли число в бинарном формате. Перевести
 его в int и вывести на экран (“10” -> 2).
 */
public class BinaryToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        System.out.println("\"" + number + "\" -> " + binaryToInt(number));
    }

    static int binaryToInt(String l) {
        return Integer.parseInt(l, 2);
    }
}
