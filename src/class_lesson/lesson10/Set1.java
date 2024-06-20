package class_lesson.lesson10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        for (Integer el : set){
            System.out.println(el);
        }

        LinkedHashSet linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("c");
        linkedHashSet.add("b");
        linkedHashSet.add("a");
        System.out.println(linkedHashSet);

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("c");
        treeSet.add("b");
        treeSet.add("a");
        System.out.println(treeSet);


    }
}
