package main.java.lesson6.GeometricalFigure;
//Создайте класс Circle и наследуйте его от GeometricalFigure. Добавьте в класс Circle поле double radius.
public class Circle extends GeometricalFigure{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //Добавьте в класс Circle метод printInformation(), который будет выводить координаты центра и радиус круга.
    @Override
    public void printInformation(){
        System.out.println("Тип фигуры: " + getFigureType());
        System.out.println("Координата x: " + super.getCenter().getX());
        System.out.println("Координата y: " + super.getCenter().getY());
        System.out.println("Радиус: " + this.radius);
    }

    public Circle(Point center, double radius){
        super(center);
        this.radius = radius;
    }

    public Circle(){

    }

    @Override
    public String getFigureType() {
        return "Круг";
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public boolean containsPoint(Point point) {
        return false;
    }


}