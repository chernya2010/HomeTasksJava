package class_lesson.lesson16;

import java.util.stream.IntStream;

public class Example2 {
    public static void main(String[] args) {
        long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5)
                .filter(n -> n > 0).count();
        System.out.println(count);
    }
}
