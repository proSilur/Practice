/*
 3) Реализуйте метод рисующий на экране прямоугольник из звездочек «*»
 — его параметрами будут целые числа которые описывают длину и
 ширину такого прямоугольника.
 */

public class Rectangle {
    public static void main(String[] args) {
        //printRectangle(4,6);
    }

    static void printRectangle(int height, int length) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
