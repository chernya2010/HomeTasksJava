package class_lesson.lesson16.first_part;

import java.util.Comparator;

public class PhoneComparator implements Comparator<Telephone> {

    @Override
    public int compare(Telephone a1, Telephone a2) {
        return a1.getName().toUpperCase().compareTo(a2.getName().toUpperCase());
    }
}
