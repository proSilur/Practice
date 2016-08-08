package Seventh;

/*
2) Напишите метод для сохранения в текстовый файл
   двухмерного массива целых чисел.
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class FileArray {
    public static void main(String[] args) {
        File file = new File("array.txt");
        fileArrayWriter(file, initRandomArray(10, 10));
    }

    static void fileArrayWriter(File file, int[][] array) {
        StringBuilder builder = new StringBuilder();
        for (int[] ints : array) {
            for (int anInt : ints) {
                builder.append(anInt + "\t");
            }
            builder.append(System.lineSeparator());
        }
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(builder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int[][] initRandomArray(int arrayLength, int arrayHeight) {
        int[][] array = new int[arrayLength][arrayHeight];
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayHeight; j++) {
                array[i][j] = new Random().nextInt(100);
            }
        }
        return array;
    }
}
