/*
 Создать массив случайных чисел (размером 15 элементов). Создайте
 второй массив в два раза больше, первые 15 элементов должны быть
 равны элементам первого массива, а остальные элементы заполнить
 удвоенных значением начальных. Например
 Было → {1,4,7,2}
 Стало → {1,4,7,2,2,8,14,4}
 */

public class ArrayDoubling {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int array2[] = new int[array.length * 2];
        //Заполняем первую половину массива
        System.arraycopy(array, 0, array2, 0, array.length);
        //Заполняем вторую половину массива
        for (int i = 0; i < array.length; i++) {
            array2[i + array.length] = array[i] * 2;
        }
        //Выводим наш массив
        for (int i : array2) {
            System.out.print(i + " ");
        }
    }
}
