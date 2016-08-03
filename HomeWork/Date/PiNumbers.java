package Sixth;

/*
 4) Выведите на экран 10 строк со значением числа Пи. Причем
 в первой строке должно быть 2 знака после запятой, во
 второй 3, в третьей 4 и т.д.
 */


import java.util.Formatter;

public class PiNumbers {
    public static void main(String[] args) {
        for (int i = 2; i < 12; i++) {
            System.out.printf("%." + i + "f\n", Math.PI);
        }

        // Ну или через Форматтер:

//        Formatter formatter = new Formatter();
//        for (int i = 2; i < 12; i++) {
//            System.out.println(formatter.format("%." + i + "f\n", Math.PI));
//        }
    }
}
