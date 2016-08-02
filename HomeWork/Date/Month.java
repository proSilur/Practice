package Sixth;

/*
 1) Написать программу которая вернет количество
 миллисекунд прошедших от такого же числа, но в прошлом
 месяце до сегодняшней даты. Например если сегодня 3
 августа, то узнать сколько миллисекунд прошло с 3 июля.
 */

import java.util.Calendar;

public class Month {
    public static void main(String[] args) {
        monthMs();
    }

    static void monthMs() {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar1 = Calendar.getInstance();
        calendar.set(Calendar.MONTH, calendar1.get(Calendar.MONTH) - 1);
        System.out.print("Прошло миллисекунд от такого же числа но в прошлом месяце: ");
        System.out.print(calendar1.getTimeInMillis() - calendar.getTimeInMillis());
    }
}
