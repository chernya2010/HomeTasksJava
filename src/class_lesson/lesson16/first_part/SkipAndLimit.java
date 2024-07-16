package class_lesson.lesson16.first_part;

import java.util.stream.Stream;

public class SkipAndLimit {
    public static void main(String[] args) {
        Stream<String> phones = Stream.of("phone1", "phone333", "phone22", "phone55555", "phone4444");
        phones
                .skip(1)
                .limit(2)
                .forEach(System.out::println);
    }
}
