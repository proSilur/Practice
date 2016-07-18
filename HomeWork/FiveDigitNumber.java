import java.util.Scanner;

/*
1) Написать программу которая считывает 5-и значное число с
клавиатуры и выводит цифры из которого оно состоит.
Например : Считывается число 54698
Выводиться:
5
4
6
9
8
 */

public class FiveDigitNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write five-digit number and press Enter: ");

        int number = scanner.nextInt();

        System.out.println(number / 10000);
        System.out.println((number % 10000) / 1000);
        System.out.println((number % 1000) / 100);
        System.out.println((number % 100) / 10);
        System.out.println(number % 10);


    }
}



