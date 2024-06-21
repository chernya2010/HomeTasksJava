package class_lesson.lesson10.practice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();

        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Yellow");
        list.add("Green");

        methods.getColorList(list);

        List<String> strings = new ArrayList<>();
        strings.add("Red");
        strings.add("Yellow");
        strings.add("Green");

        methods.printCollection(strings);
        methods.addOrange(list);
        methods.changeColor(list);
        methods.getReverseList(list);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
//        methods.swapFirstAndLast(numbers);

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        methods.join(numbers, numbers2);

        Car car1 = new Car("Tesla");
        Car car2 = new Car("BMW");
        Car car3 = new Car("Volvo");
        Car car4 = new Car("Mercedes");
        Car car5 = new Car("Opel");

        LinkedList<Car> cars = new LinkedList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        System.out.println(cars);

        cars.addFirst(car4);
        cars.addLast(car5);

        System.out.println(cars);
        System.out.println(cars.peekFirst());
        System.out.println(cars.peekLast());
        System.out.println(cars.pollFirst());
        System.out.println(cars.pollLast());

        System.out.println(cars);

        Car[] cars1 = cars.toArray(new Car[3]);
        System.out.println(Arrays.toString(cars1));

        methods.printUniqueCharacters("Helloworld");

        HashSet<String> arrayList = new HashSet<>();
        arrayList.add("Шалаш");
        arrayList.add("Алла");
        arrayList.add("Дичка");

        methods.getPalindroms(arrayList);
    }
}
