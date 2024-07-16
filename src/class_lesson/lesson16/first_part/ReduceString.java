package class_lesson.lesson16.first_part;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceString {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("hello", "world");
        Optional<String> sentence = stringStream.reduce((x, y) -> x + " " + y);
        System.out.println(sentence.get());
    }
}
