package class_lesson.lesson10.practice;

import java.util.HashSet;
import java.util.Set;

public class MainMap {
    public static void main(String[] args) {
        MyMap myMap = new MyMap();
        System.out.println(myMap.getRainbowColor());

        myMap.printMap(myMap.getRainbowColor());
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        myMap.evenAndOdd(set);
    }
}
