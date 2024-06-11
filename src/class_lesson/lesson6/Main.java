package class_lesson.lesson6;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
//        cat.name = "";
//        cat.age = -100;
//        cat.weight = 0;

        Cat barsik = new Cat("Barsik", 5, 3);
        String barsikNamename = barsik.getName();
        int barsikAge = barsik.getAge();
        int barsikWeight = barsik.getWeight();

        System.out.println(barsikNamename);
        System.out.println(barsikAge);
        System.out.println(barsikWeight);

        barsik.setAge(-1);
        System.out.println(barsik.getAge());
    }
}
