package class_lesson.lesson10;

import java.util.ArrayList;

public class ListApp {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<>();
        states.add("Germany");
        states.add("France");
        states.add("England");
        states.add("Spain");

        System.out.println(states.get(1));

        states.set(1, "Italy");

        System.out.println(states.get(1));

        System.out.printf("В списке %d элементов\n", states.size());
        for (String str : states){
            System.out.println(str);
        }

        if(states.contains("Germany")){
            System.out.println("Germany is in list");
        }

        states.remove("Germany");
        System.out.println(states);
        states.remove(0);
        System.out.println(states);

        Object[] countries = states.toArray();
        for(Object object : countries){
            System.out.println(object);
        }
    }
}
