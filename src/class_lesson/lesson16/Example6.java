package class_lesson.lesson16;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Example6 {
    public static void main(String[] args) {
        IntStream intStream = Arrays.stream(new int[]{1, 2, 3, 4, });
        intStream.forEach(s -> System.out.println(s));

        DoubleStream doubleStream = Arrays.stream(new double[]{1.5, 2.5, 3.5, 4.5, });
        intStream.forEach(s -> System.out.println(s));
    }
}
