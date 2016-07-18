import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fuelPrice = 22.3;
        double fuelR = 7.5;

        System.out.println("Enter distance: ");
        int distance = scanner.nextInt();

        double totalSum = ((fuelPrice * distance * 2) / 100) * fuelR;
        System.out.println(totalSum + " UAH");

        scanner.close();

    }
}



