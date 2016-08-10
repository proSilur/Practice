/*
 1) «Перевернуть массив» (При выполнении задания использовать
 дополнительный массив нельзя) -  (3 часа)

  Было                       Стало
 [1, 2, 3, 4, 5, 6]         [1, 1, 1, 1, 1, 1]
 [1, 2, 3, 4, 5, 6]         [2, 2, 2, 2, 2, 2]
 [1, 2, 3, 4, 5, 6]         [3, 3, 3, 3, 3, 3]
 [1, 2, 3, 4, 5, 6]         [4, 4, 4, 4, 4, 4]
 [1, 2, 3, 4, 5, 6]         [5, 5, 5, 5, 5, 5]
 [1, 2, 3, 4, 5, 6]         [6, 6, 6, 6, 6, 6]
 */

public class InvertedArray {
    public static void main(String[] args) {
        int array[][] = {{1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6}};
        //Переворот:
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[i].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        //Вывод на экран:
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
