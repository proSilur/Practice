/*

 4) Введите строку текста с клавиатуры — реализуйте программу для
    возможности подсчета количества символа — 'b' в этой строке, с выводом
    результат на экран.
 */

import java.util.Scanner;

public class LetterB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        int counter = 0;
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == 'b') {
                counter++;
            }
        }
        System.out.println("Number of letter <b> in your sentences = " + counter);
    }
}
