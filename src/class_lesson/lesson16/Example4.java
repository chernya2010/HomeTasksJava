package class_lesson.lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Example4 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Париж", "Лондон", "Мадрид");

        Stream<String> citiesStream = cities.stream();
        citiesStream = citiesStream.filter(s -> s.length() == 6);
        citiesStream.forEach(s -> System.out.println(s));


    }
}
