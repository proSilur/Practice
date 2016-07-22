/*
 3)Ввести с клавиатуры число (до миллиарда) которое обозначает
 количество долларов и центов пользователя. Вывести это количество
 прописью. (4 часа)
 Например:
 How much money do you have?
 123,34
 You have: one hundred twenty three dollars thirty four cents
 */

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ten = {"one, two, three, four, five, six, seven, eight, nine"};
        String[] twenty = {"eleven, twelve, thirteen, fourteen, fifteen, sixteen, seventeen, eighteen, nineteen"};
        String[] hundred = {"ten, twenty, thirty, forty, fifty, sixty, seventy, eighty, ninety"};
        String[] million = {"hundred, thousand, million"};
        String[] money = {"dollar", "dollars", "cent", "cents"};
        String number = scanner.nextLine();

        for (int i = 0; i < number.length(); i++) {
            if(number.contains(".") || number.contains(",")){

            }
        }


    }
}
