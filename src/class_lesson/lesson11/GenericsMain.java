package class_lesson.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsMain {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
//        String text = list.get(0) + " world!";
//        System.out.println(text);
//        list.add(123);

        for (Object o : list){
            System.out.println((String) o);
        }

        List<String> list1 = new ArrayList<>();
        list1.add("helllo");
        String test = list1.get(0);
        System.out.println(test);

        List<String> list2 = Arrays.asList("hello", "world");
//        List<Integer> list4 = new ArrayList<>(list2);
//        System.out.println(list4);

    }
}
