/*
4)  С помощью циклов вывести на экран все простые числа от 1 до 100.
    Простое число — число которое делиться нацело только на единицу или
    само на себя. Первые простые числа это — 2,3,5,7...
 */

public class Primes {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            for (int j = 2; j <= i; j++) {
                if (j != i && i % j == 0) {
                    break;
                } else if (j == i) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
