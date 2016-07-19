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
        // Беру с учетом того что квартира, этаж и номер подьезда начинаются с 1
        System.out.println("Write room number (integer greater than zero): ");
        int roomNumber = scanner.nextInt();
        int counter = 0;
        for (int i = 1; i <= 4; i++) {
            if (roomNumber > 4 * 9 * 4 || roomNumber <= 0) {
                System.out.println("In this house there is no apartments under this number");
                break;
            }
            for (int j = 1; j <= 9; j++) {
                for (int k = 0; k < 4; k++) {
                    counter++;
                    if (counter == roomNumber) {
                        System.out.println("Your room in " + i + " Entrance on " + j + " floor");
                    }
                }
            }
        }
        scanner.close();
    }
}
