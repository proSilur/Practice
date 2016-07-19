/*
4)  С помощью циклов вывести на экран все простые числа от 1 до 100.
    Простое число — число которое делиться нацело только на единицу или
    само на себя. Первые простые числа это — 2,3,5,7...
 */


public class Primes {
    public static void main(String[] args) {

        // Решето Эратосфена
        boolean[] array = new boolean[100];
        // array[0] = array[1] = false;
        for (int i = 2; i < array.length; i++) {
            array[i] = true;
        }
        for (int i = 2; i < array.length; i++) {
            if (array[i]) {
                for (int j = 2; j * i < array.length; j++) {
                    array[i * j] = false;
                }
            }
        }

        // Print our numbers in three columns for clarity :)
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] && temp < 3) {
                System.out.print(i + "\t");
                temp++;
            } else if (i % 10 == 0 && temp == 3) {
                System.out.println();
                temp = 0;
            }
        }
    }
}
