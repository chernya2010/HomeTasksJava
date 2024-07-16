package class_lesson.lesson16.first_part;

import java.util.ArrayList;
import java.util.Arrays;

public class Match {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Tom", "Sam", "Bob", "Alice"));

        boolean any = names.stream().anyMatch(s -> s.length() > 3);
        System.out.println(any);

        boolean all = names.stream().allMatch(s -> s.length() == 3);
        System.out.println(all);

        boolean none = names.stream().noneMatch(s -> s == "Bill");
        System.out.println(none);
    }
}
