package class_lesson.lesson16.first_part;

import java.util.stream.Stream;

public class PhoneFlatMap {
    public static void main(String[] args) {
        Stream<Telephone> phoneStream1 = Stream.of(
                new Telephone("Phone1", 5000),
                new Telephone("Phone2", 4000),
                new Telephone("Phone3", 3000)

        );

        phoneStream1.flatMap(p -> Stream.of(
                String.format("название %s цена без скидки %d", p.getName(), p.getPrice()),
                String.format("название %s цена со скидкой %f", p.getName(), p.getPrice() * 0.9)))
        .forEach(System.out::println);
    }
}
