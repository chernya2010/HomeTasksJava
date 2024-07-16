package class_lesson.lesson16.parallel;

import java.util.stream.Stream;

public class ParallelStreamSequentialMain {
    public static void main(String[] args) {
        Stream<String> strStream = Stream.of("мама", "мыла", "раму");
        String result = strStream.parallel()
                .filter(s -> s.length() < 5)
                .sequential()
                .reduce("Результат: ", (x, y) -> x + " " + y);
        System.out.println(result);
    }
}
