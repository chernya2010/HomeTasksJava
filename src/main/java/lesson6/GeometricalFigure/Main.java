package main.java.lesson6.GeometricalFigure;

public class Main {
    //Вывести информацию о всех фигурах в отдельном классе Main в методе main.
    public static void main(String[] args) {
        Point point = new Point(4, 5);
        Circle circle = new Circle();
        circle.setRadius(5);
        circle.setCenter(point);
        circle.printInformation();

        Rectangle rectangle = new Rectangle(point, 3, 5);
        rectangle.setCenter(point);
        rectangle.getHeight();
        rectangle.getWidth();
        rectangle.getArea();
        rectangle.printInformation();

        Square square = new Square(point, 5,5);
        rectangle.setCenter(point);
        square.getHeight();
        square.getArea();
        square.printInformation();

        System.out.println(containsCircle(geometricalFigures));
    }

    static Circle circle1 = new Circle();
    static Rectangle rectangle1 = new Rectangle();
    static Square square1 = new Square();

    static GeometricalFigure[] geometricalFigures = new GeometricalFigure[]{circle1, rectangle1, square1};

    public static boolean containsCircle(GeometricalFigure... geometricalFigures) {
        for (GeometricalFigure fig : geometricalFigures){
            if (fig instanceof Circle){
                return true;
            }
        }
        return false;
    }
}
