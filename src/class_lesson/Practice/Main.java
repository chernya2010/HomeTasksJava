package class_lesson.Practice;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(4, 5);
        Circle circle = new Circle();
        circle.setRadius(5);
        circle.setCenter(point);

        circle.printInformation();
        //вывести квадрат
    }
}
