package class_lesson.lesson16.first_part;

import java.util.ArrayList;
import java.util.Collections;

public class Example3 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Париж", "Лондон", "Мадрид");
        cities.stream().filter(s -> s.length() == 6).forEach(s -> System.out.println(s));
    }
}
