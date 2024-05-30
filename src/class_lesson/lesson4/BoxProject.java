package class_lesson.lesson4;

public class BoxProject {
    public static void main(String[] args) {
        Box box1 = new Box();//создание объекта класса, конструктор без параметров
        Box box2 = new Box(10,20,15);//вызов конструктора с параметрами

        System.out.println(box1.height);

        double volume = box2.height * box2.width * box2.depth;
        System.out.println("Объём коробки: " + volume);

        Box box3 = new Box();
        Box box4 = box3;

        box3.height = 1;
        System.out.println(box3.height);
        System.out.println(box4.height);
    }

}
