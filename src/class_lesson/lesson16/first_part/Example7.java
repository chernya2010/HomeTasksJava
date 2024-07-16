package class_lesson.lesson16.first_part;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example7 {
    public static void main(String[] args) {
        Stream<String> citiesStream = Stream.of("Париж", "Лондон", "Мадрид");
        citiesStream.forEach(s -> System.out.println(s));

        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
        intStream.forEach(s -> System.out.println(s));
    }
}
