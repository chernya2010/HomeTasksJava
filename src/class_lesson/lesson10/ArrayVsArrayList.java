package class_lesson.lesson10;

import java.util.ArrayList;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        String[] strings = new String[10];
        ArrayList<String> list = new ArrayList<>();

        int n = strings.length;
        int n1 = list.size();

        String s = strings[3];
        String s1 = list.get(3);

        strings[3] = "10";
        list.set(3,"5");

        list.add("4");//допишет в конец листа
        list.add(4, "45");

        strings[2] = null;
        list.remove(3);
    }
}
