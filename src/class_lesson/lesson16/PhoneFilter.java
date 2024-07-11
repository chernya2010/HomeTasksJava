package class_lesson.lesson16;

import java.util.stream.Stream;

public class PhoneFilter {
    public static void main(String[] args) {
        Stream<Telephone> phoneStream1 = Stream.of(
                new Telephone("Phone1", 5000),
                new Telephone("Phone2", 4000),
                new Telephone("Phone3", 3000)

        );

        phoneStream1.filter(telephone -> telephone.getPrice() <= 5000)
                .forEach(telephone -> System.out.println(telephone.getName()));

    }
}
