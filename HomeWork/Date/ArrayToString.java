package Sixth;

import java.util.Arrays;

/*
 2) Написать свой вариант метода Arrays.toString() для int[].
 */
public class ArrayToString {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array));
        System.out.println(myToString(array));

    }


    static String myToString(int[] array) {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array.length) {
                builder.append(array[i]).append(" ☺ ");
            } else builder.append(array[i]);
        }
        builder.append("}");
        return builder.toString();
    }
}
