package class_lesson.lesson16.parallel;

import java.util.Optional;
import java.util.stream.Stream;

public class ParallelMain {
    public static void main(String[] args) {
        Stream<Integer> numsStream = Stream.of(1, 2, 3, 4, 5, 6, 7);
        Optional<Integer> result = numsStream.parallel().reduce((x, y) -> x * y);
        System.out.println(result.get());

    }
}
