package class_lesson.lesson16;

import java.util.ArrayList;
import java.util.Arrays;

public class MinMaxPhone {
    public static void main(String[] args) {
        ArrayList<Telephone> telephones = new ArrayList<>();
        telephones.addAll(Arrays.asList(new Telephone("Phone1", 5000, "Samsung"),
                                        new Telephone("Phone2", 4000, "Apple"),
                                        new Telephone("Phone3", 3000, "LG")));

        Telephone min = telephones.stream().min(Telephone::compare).get();
        Telephone max = telephones.stream().max(Telephone::compare).get();

        System.out.printf("Min name: %s Price: %d \n", min.getName(), min.getPrice());
        System.out.printf("Max name: %s Price: %d \n", max.getName(), max.getPrice());
    }
}
