package Sixth;

import java.util.Scanner;
/*
 3)Вовочка сидя на уроке писал подряд одинаковые числа. Когда
 Марья Ивановна забрала у него тетрадь там было несколько рядов
 чисел. Напишите программу которая определит минимальное
 число которое писал Вовочка например:
 11111111=>1
 12121212=>12
 121121121=>121
 */
public class VovaNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Numbers: ");
        System.out.println(minNumber(scanner.nextLine()));
        scanner.close();
    }
    static String minNumber(String line) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            builder.append(line.charAt(i));
            if (check(builder.toString(), line)) {
                break;
            }
        }
        return builder.toString();
    }
    static boolean check(String temp, String line) {
        StringBuilder builder = new StringBuilder(line);
        while (builder.indexOf(temp) == 0) {
            builder.delete(0, temp.length());
        }
        return (builder.length() == 0);
    }
}