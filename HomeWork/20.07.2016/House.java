/*
 2) Есть девятиэтажный дом, в котором 4 подъезда. Номер подъезда
 начинается с единицы. На одном этаже 4 квартиры. Напишите программу
 которая получит номер квартиры с клавиатуры, и выведет на экран на
 каком этаже, какого подъезда расположенна эта квартира. Если такой
 квартиры нет в этом доме то нужно сообщить об этом пользователю.
 */

import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write room number (integer greater than zero): ");
        int roomNumber = scanner.nextInt();

        if (roomNumber <= 144 && roomNumber > 0) {
            int entrance = (roomNumber % 36 == 0) ? roomNumber / 36 : roomNumber / 36 + 1;
            int temp = roomNumber - 36 * (entrance - 1);
            int floor = (temp % 4 == 0) ? temp / 4 : temp / 4 + 1;
            System.out.println("Your room in " + entrance + " Entrance on " + floor + " Floor");
        } else System.out.println("In this house there is no apartments under this number");
        scanner.close();
    }
}
