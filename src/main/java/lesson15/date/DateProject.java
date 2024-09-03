package main.java.lesson15.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateProject {

    public static void main(String[] args) {
        Date dateFrom = new Date();
        System.out.println(dateFrom.getTime() + " миллисекунд прошло с 01-01-1970");
        Scanner scanner = new Scanner(System.in);
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Введите дату в формате ДД.ММ.ГГГГ");
        System.out.println("Для примера, сейчас: " + format.format(new Date()));
        Date date = null;
        String line = scanner.nextLine();
        try {
            date = format.parse(line);
        } catch (ParseException e) {
            System.out.println("Дата не введена либо введён неправильный формат даты.");
        }
        System.out.println(format.format(date));
    }
}