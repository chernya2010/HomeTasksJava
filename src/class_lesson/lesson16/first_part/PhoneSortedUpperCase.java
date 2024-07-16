package class_lesson.lesson16.first_part;

import java.util.stream.Stream;

public class PhoneSortedUpperCase {
    public static void main(String[] args) {
        Stream<Telephone> phoneStream1 = Stream.of(
                new Telephone("Phone1", 5000, "Samsung"),
                new Telephone("Phone2", 4000, "Apple"),
                new Telephone("Phone3", 3000, "LG")
        );

        phoneStream1
                .sorted(new PhoneComparator())
                .forEach(phone -> System.out.printf("%s (%s) : %d \n",
                        phone.getName(), phone.getModel(), phone.getPrice()));
    }
}
