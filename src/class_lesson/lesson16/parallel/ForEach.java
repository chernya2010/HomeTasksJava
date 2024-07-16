package class_lesson.lesson16.parallel;

import class_lesson.lesson16.first_part.PhoneComparator;
import class_lesson.lesson16.first_part.Telephone;

import java.util.stream.Stream;

public class ForEach {
    public static void main(String[] args) {
        Stream<Telephone> phoneStream = Stream.of(
                new Telephone("phone1", 5000, "Samsung"),
                new Telephone("phone333", 4000, "Apple"),
                new Telephone("phone55555", 3000, "Nokia"),
                new Telephone("phone4444", 2000, "Nokia")
        );

        phoneStream.parallel()
                .sorted(new PhoneComparator())
                .forEachOrdered(s -> System.out.println(s.getName()));
    }
}
