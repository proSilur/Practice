package Sixth;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/*
 1) Ввести с консоли дату. Сравнить ее с текущей датой в
 системе. Вывести отличающиеся части (год, месяц) на
 экран
 */
public class DateDifferences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date <dd MM yyyy>");
        dateDifferences(scanner.nextLine());
    }

    static void dateDifferences(String date) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
        try {
            format.parse(date);
        } catch (ParseException e) {
            System.out.println("Wrong input!");
        }

        if (format.getCalendar().get(Calendar.YEAR) != calendar.get(Calendar.YEAR)) {
            System.out.println("Entered Year - " + format.getCalendar().get(Calendar.YEAR) + " Today is "
                    + calendar.get(Calendar.YEAR) + " Year");
        }
        if (format.getCalendar().get(Calendar.MONTH) != calendar.get(Calendar.MONTH)) {
            System.out.println("Entered Month - " + (format.getCalendar().get(Calendar.MONTH) + 1) + " Today is "
                    + (calendar.get(Calendar.MONTH) + 1) + " Month");
        }
    }
}
