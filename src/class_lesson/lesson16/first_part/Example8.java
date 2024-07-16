package class_lesson.lesson16.first_part;

import java.util.stream.Stream;

public class Example8 {
    public static void main(String[] args) {
        Stream<String> citiesStream = Stream.of("Париж", "Лондон", "Мадрид");
        citiesStream.forEach(System.out::println);
    }
}
