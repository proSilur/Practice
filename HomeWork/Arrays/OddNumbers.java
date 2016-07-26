/*
 Дан массив {0,5,2,4,7,1,3,19} — написать программу для подсчета
 нечетных цифр в нем.
 */

public class OddNumbers {
    public static void main(String[] args) {
        int array[] = {0, 5, 2, 4, 7, 1, 3, 19};
        int counter = 0;
        for (int anArray : array) {
            if (anArray % 2 != 0) {
                counter++;
            }
        }
        System.out.println("odd number = " + counter);
    }
}
