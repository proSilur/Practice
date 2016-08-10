/*
     Дан треугольник координаты вершин А(0,0), В(4,4), С(6,1). Пользователь
     вводит с клавиатуры координаты точки x и y. Написать программу которая
     определит лежит ли эта точка внутри треугольника или нет.

*/

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        //Координаты треугольника
        double xA = 0;
        double yA = 0;
        double xB = 4;
        double yB = 4;
        double xC = 6;
        double yC = 1;

        Scanner scanner = new Scanner(System.in);
        // Вводим координаты нашей точки
        System.out.println("Enter the coordinates of the point (X, ): ");
        double x = scanner.nextDouble();
        System.out.println("Enter the coordinates of the point ( ,Y): ");
        double y = scanner.nextDouble();

        //Несколько векторных произведений
        double firstSide = (xA - x) * (yB - yA) - (xB - xA) * (yA - y);
        double secondSide = (xB - x) * (yC - yB) - (xC - xB) * (yB - y);
        double thirdSide = (xC - x) * (yA - yC) - (xA - xC) * (yC - y);

        //Вывод на экран
        if ((firstSide >= 0 && secondSide >= 0 && thirdSide >= 0)
                || (firstSide <= 0 && secondSide <= 0 && thirdSide <= 0)) {
            if (firstSide == 0 || secondSide == 0 || thirdSide == 0) {
                System.out.println("Точка лежит на линии треугольника!");
            } else {
                System.out.println("Точка лежит внутри треугольника!");
            }
        } else {
            System.out.println("Точка лежит за пределами треугольника!");
        }
        scanner.close();
    }
}



