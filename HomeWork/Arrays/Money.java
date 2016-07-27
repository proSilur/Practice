package third;
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
        String[] ten = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] hundred = {"", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] million = {" million", " thousand", " hundred"};
        String[] number = scanner.nextLine().split("[,.]");
        String cents = (number.length > 1) ? number[1] : "";
        String[] count = {"", "", ""};
        int temp = 0;

        for (int i = number[0].length(); i > 0; i--) {
            temp++;
            char count1 = number[0].toCharArray()[i - 1];
            if (temp > 0 && temp <= 3) {
                count[2] = count1 + count[2];
            } else if (temp > 3 && temp <= 6) {
                count[1] = count1 + count[1];
            } else if (temp > 6 && temp <= 9) {
                count[0] = count1 + count[0];
            }
        }

        String output = "";
        for (int i = 0; i < count.length; i++) {
            if (count[i].equals("")) continue;
            if (count[i].length() == 3) {
                output += ten[Integer.parseInt(count[i]) / 100] + " hundred ";
                if ((Integer.parseInt(count[i]) % 100) < 20) {
                    output += ten[Integer.parseInt(count[i]) % 100];
                } else {
                    output += hundred[(Integer.parseInt(count[i]) % 100) / 10 - 1];
                    if (Integer.parseInt(count[i]) % 10 > 0) output += " ";
                    output += ten[Integer.parseInt(count[i]) % 10];
                }
            } else if (count[i].length() == 2) {
                if (Integer.parseInt(count[i]) < 20) {
                    output += ten[Integer.parseInt(count[i]) % 100];
                } else {
                    output += hundred[(Integer.parseInt(count[i]) % 100) / 10 - 1];
                    if (Integer.parseInt(count[i]) % 10 > 0) output += " ";
                    output += ten[Integer.parseInt(count[i]) % 10];
                }
            } else if (count[i].length() == 1) {
                output += ten[(Integer.parseInt(count[i]))];
            }
            output += (i == 2) ? " " : million[i] + " ";
        }
        output += "Dollar(s) ";
        if (cents.length() == 2) {
            if (Integer.parseInt(cents) < 20) {
                output += ten[Integer.parseInt(cents) % 100];
            } else {
                output += hundred[(Integer.parseInt(cents) % 100) / 10 - 1];
                if (Integer.parseInt(cents) % 10 > 0) output += " ";
                output += ten[Integer.parseInt(cents) % 10];
            }
        } else if (cents.length() == 1) {
            output += (cents.equals("1"))? "ten" : hundred[(Integer.parseInt(cents)) - 1];
        }
        output += (!cents.equals("")) ? " Cent(s)" : "";
        System.out.println("You have: " + output);
    }
}
