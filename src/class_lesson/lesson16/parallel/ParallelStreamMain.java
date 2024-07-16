package class_lesson.lesson16.parallel;

import java.util.stream.Stream;

public class ParallelStreamMain {
    public static void main(String[] args) {
        Stream<String> strStream = Stream.of("Hello", "worls", "!");
        String result = strStream.parallel().reduce("Результат: ", (x, y) -> x + " " + y);
        System.out.println(result);
    }
}
