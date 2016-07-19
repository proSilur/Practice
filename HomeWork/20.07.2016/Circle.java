/*
 1) Есть круг с центром в начале координат и радиусом 4. Пользователь
 вводит с клавиатуры координаты точки x и y. Написать программу которая
 определит лежит ли эта точка внутри круга или нет.
 */

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        String output = (distance <= 4) ? "IN CIRCLE" : "OUT OF CIRCLE";
        System.out.println(output + ", distance from the center = " + distance);
        scanner.close();
    }
}
