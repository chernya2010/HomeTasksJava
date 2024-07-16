package class_lesson.lesson16.first_part;

import java.util.stream.Stream;

public class PhoneMap {
    public static void main(String[] args) {
        Stream<Telephone> phoneStream1 = Stream.of(
                new Telephone("Phone1", 5000),
                new Telephone("Phone2", 4000),
                new Telephone("Phone3", 3000)

        );

        phoneStream1.map(p -> "название " + p.getName() + " цена " + p.getPrice())
                .forEach(System.out::println);
    }
}
