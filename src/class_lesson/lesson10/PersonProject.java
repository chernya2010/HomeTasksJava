package class_lesson.lesson10;

import java.util.TreeSet;
import java.util.stream.Stream;

public class PersonProject {
    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<>();
        people.add(new Person("Tom"));
        people.add(new Person("Shon"));
        people.add(new Person("Den"));

        for(Person person : people){
            System.out.println(person);
        }
    }
}
