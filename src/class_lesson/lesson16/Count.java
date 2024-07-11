package class_lesson.lesson16;

import java.util.ArrayList;
import java.util.Arrays;

public class Count {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Tom", "Sam", "bob", "alice"));
        System.out.println(names.stream().filter(n -> n.length() <= 3).count());
    }
}
