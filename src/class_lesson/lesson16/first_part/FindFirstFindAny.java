package class_lesson.lesson16.first_part;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class FindFirstFindAny {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Tom", "Sam", "bob", "alice"));
        Optional<String> first = names.stream().findFirst();
        Optional<String> any = names.stream().findAny();

        System.out.println(first);
        System.out.println(any);


    }


}
