package fourth;

/*
 1) Напишите метод который вернет максимальное число из массива целых
 чисел.
 */
public class Maximum {
    public static void main(String[] args) {
        int[] array = {2, 4, 1, 3, 6, 5};
        System.out.println(max(array));
    }

    static int max(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
