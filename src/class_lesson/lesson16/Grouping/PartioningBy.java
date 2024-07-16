package class_lesson.lesson16.Grouping;

import class_lesson.lesson16.first_part.Telephone;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartioningBy {
    public static void main(String[] args) {
        Stream<Telephone> phoneStream = Stream.of(
                new Telephone("phone1", 5000, "Samsung"),
                new Telephone("phone333", 4000, "Apple"),
                new Telephone("phone55555", 3000, "ert"),
                new Telephone("phone4444", 2000, "Nokia")
        );

        Map<Boolean, List<Telephone>> phonesByCompany = phoneStream.collect(
                Collectors.partitioningBy(p -> p.getModel() == "Apple"));
        for (Map.Entry<Boolean, List<Telephone>> item : phonesByCompany.entrySet()) {
            System.out.println(item.getKey());
            for (Telephone telephone : item.getValue()) {
                System.out.println(telephone.getName());
            }
            System.out.println();
        }
    }
}
