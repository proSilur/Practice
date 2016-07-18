import java.util.Scanner;

/*

 3) Написать программу которая вычислит и выведет на экран
    длину окружности, если ее радиус считывается с клавиатуры.

 */
public class Circumference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write radius and press Enter: ");

        double radius = scanner.nextInt();
        double circumference = 2 * Math.PI * radius;

        System.out.println("Circumference = " + circumference);


    }
}
