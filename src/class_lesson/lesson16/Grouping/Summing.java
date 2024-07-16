package class_lesson.lesson16.Grouping;

import class_lesson.lesson16.first_part.Telephone;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Summing {
    public static void main(String[] args) {
        Stream<Telephone> phoneStream = Stream.of(
                new Telephone("phone1", 5000, "Samsung"),
                new Telephone("phone333", 4000, "Apple"),
                new Telephone("phone55555", 3000, "Nokia"),
                new Telephone("phone4444", 2000, "Nokia")
        );

        Map<String, Integer> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(Telephone::getModel, Collectors.summingInt(Telephone::getPrice)));

        for (Map.Entry<String, Integer> item : phonesByCompany.entrySet()){
            System.out.println(item.getKey() + " - " + item.getValue());
        }
    }
}
