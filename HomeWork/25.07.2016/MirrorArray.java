package third;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 2)Написать код для зеркального переворота массива (7,2,9,4) -> (4,9,2,7). -
 * массив может быть произвольной длинны. (При выполнении задания
 * использовать дополнительный массив нельзя)(1 час)
 */
public class MirrorArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        System.out.println("Изначальный массив: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("Зеркальный массив: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }


}
