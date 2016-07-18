import java.util.Scanner;

/*
  2) Написать программу которая вычислит и выведет на экран
     площадь треугольника если известны его стороны.
 */
public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write first side of triangle and press Enter: ");
        int firstPart = scanner.nextInt();

        System.out.println("Write second side of triangle and press Enter: ");
        int secondPart = scanner.nextInt();

        System.out.println("Write third side of triangle and press Enter: ");
        int thirdPart = scanner.nextInt();

        double semiPerimeter = (firstPart + secondPart + thirdPart) / 2;
        double triangleArea = Math.sqrt(semiPerimeter * (semiPerimeter - firstPart) * (semiPerimeter - secondPart) * (semiPerimeter - thirdPart));

        System.out.println("Triangle Area = " + triangleArea);

    }
}
