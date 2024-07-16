package class_lesson.lesson16.Grouping;

import class_lesson.lesson16.first_part.Telephone;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mapping {
    public static void main(String[] args) {
        Stream<Telephone> phoneStream = Stream.of(
                new Telephone("phone1", 5000, "Samsung"),
                new Telephone("phone333", 4000, "Apple"),
                new Telephone("phone55555", 3000, "Nokia"),
                new Telephone("phone4444", 2000, "Nokia")
        );

        Map<String, List<String>> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(Telephone::getModel, Collectors.mapping(Telephone::getName, Collectors.toList())));

        for (Map.Entry<String,List<String>> item : phonesByCompany.entrySet()){
            System.out.println(item.getKey());
            for (String name : item.getValue()){
                System.out.println(name);
            }
        }
    }
}
