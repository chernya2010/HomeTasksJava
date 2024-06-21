package main.java.lesson6.GeometricalFigure;

public class Main {
    //Вывести информацию о всех фигурах в отдельном классе Main в методе main.
    public static void main(String[] args) {
        Point pointForCircle = new Point(7, 5);
        Point circleCenter = new Point(10, 7);
        Circle circle = new Circle(pointForCircle, 3);
        circle.setCenter(circleCenter);
        circle.printInformation();
        System.out.println("Содержит точку: " + circle.containsPoint(pointForCircle));
        System.out.println("-----------------------------------------------------");

        Point pointForRectangle = new Point(9, 4);
        Point rectangleCenter = new Point(4, 2);
        Rectangle rectangle = new Rectangle(rectangleCenter,8, 4);
        rectangle.setCenter(rectangleCenter);
        rectangle.printInformation();
        System.out.println("Содержит точку: " + rectangle.containsPoint(pointForRectangle));
        System.out.println("-----------------------------------------------------");

        Point pointForSquare = new Point(4, 1);
        Point squareCenter = new Point(2, 2);
        Square square = new Square(squareCenter, 4);
        square.setCenter(squareCenter);
        square.printInformation();
    }
}
