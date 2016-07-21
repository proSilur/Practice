package third;

import java.util.Scanner;

/*
   Написать код для возможности создания массива целых чисел (размер
   вводиться с клавиатуры) и возможности заполнения каждого его элемента
   вручную. Выведите этот массив на экран.
 */
public class DynamicArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write array length: ");
        int arrayLength = scanner.nextInt();
        System.out.println("Now fill array: ");
        int array[] = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i : array) {
            System.out.print(i + " ");
        }

    }
}
