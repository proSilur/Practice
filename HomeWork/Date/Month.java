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
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, -1);

        Date dateToday = new Date();
        Date dateMonthAgo = calendar.getTime();
        System.out.println("Прошло " + (dateToday.getTime() - dateMonthAgo.getTime()) + " МС с этого же числа прошлого месяца.");
    }
}
