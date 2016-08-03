package Sixth;

/*
 2) Расстояние Хэмминга между двумя двоичными числами - это
 число позиций, в которых биты различаются .
 Для примера:
 117 = 0 1 1 1 0 1 0 1
 17 = 0 0 0 1 0 0 0 1
 -----------------------------------
 H = 0+1+1+0+0+1+0+0 = 3 - расстояние Хэмминга между (117,17)
 Даны два положительных целых числа (N, M) в десятичном виде.
 Вам необходимо подсчитать расстояние Хэмминга между этими
 двумя числами.
 */

import java.util.Scanner;

public class HammingDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter second number: ");
        int second = scanner.nextInt();
        System.out.println("Hamming Distance is: " + hammingDistance(first ^ second));
    }

    private static int hammingDistance(int a) {
        int count = 0;
        while (a > 0) {
            count += a & 1;
            a = a >>> 1;
        }
        return count;
    }
}
