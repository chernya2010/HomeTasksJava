package main.java.lesson6.GeometricalFigure;

import class_lesson.lesson7.enums.Season;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        /*В main попробуйте создать переменную типа Printable и записать в неё круг (new Circle(arguments)).
        Попробуйте вызвать метод printInformation для этой переменной.*/
        Printable printable = new Circle(pointForCircle, 3);
        System.out.println(printable.printInformation());
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
        System.out.println("Содержит точку: " + square.containsPoint(pointForSquare));
        System.out.println("-----------------------------------------------------");

        System.out.println("Содержит круг: " + containsCircle(geometricalFigures));
        System.out.println("-----------------------------------------------------");

        System.out.println(getNotRoundFigureTypes());
    }

    static Circle circle1 = new Circle();
    static Rectangle rectangle1 = new Rectangle();
    static Square square1 = new Square();

    static GeometricalFigure[] geometricalFigures = new GeometricalFigure[]{circle1, rectangle1, square1};

    /*В классе с методом main создайте ещё один статический метод: containsCircle,
    который будет принимать один аргумент типа GeometricalFigure[] и возвращать true,
    если в массиве фигур есть хотя бы один круг и false, если их нет.*/
    public static boolean containsCircle(GeometricalFigure... geometricalFigures) {
        for (GeometricalFigure fig : geometricalFigures){
            if (fig instanceof Circle){
                return true;
            }
        }
        return false;
    }

    /*В классе Main добавьте метод getNotRoundFigureTypes(),
    который пройдёт циклом по всем значениям FigureType и вернёт массив
    только из тех, в которых round имеет значение false.*/
    public static List<String> getNotRoundFigureTypes(){
        FigureType[] possibleValues = FigureType.values();
        List<String> enumList = new ArrayList<String>();
        for(FigureType type : FigureType.values()){
            if (type.isRound() == false) {
                enumList.add(String.valueOf(possibleValues[type.ordinal()]));
            }
        }
        return enumList;
    }
}
