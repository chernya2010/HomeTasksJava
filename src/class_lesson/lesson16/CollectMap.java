package class_lesson.lesson16;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectMap {
    public static void main(String[] args) {
        ArrayList<Telephone> phones = new ArrayList<>();
        phones.addAll(Arrays.asList(
                new Telephone("Phone1", 5000),
                new Telephone("Phone2", 4000),
                new Telephone("Phone3", 3000)

        ));

        Map<String, Integer> phonesMap = phones.stream()
                .collect(Collectors.toMap(
                        n -> n.getName(),
                        p -> p.getPrice()
                ));
        phonesMap.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
