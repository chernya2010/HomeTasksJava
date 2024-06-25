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
    public boolean printInformation(){
        System.out.println("Тип фигуры: " + getFigureType());
        System.out.println("Координата x: " + super.getCenter().getX());
        System.out.println("Координата y: " + super.getCenter().getY());
        System.out.println("Радиус: " + this.radius);

        return false;
    }

    public Circle(Point center, double radius){
        super(center);
        this.radius = radius;
    }

    public Circle(){
    }


    @Override
    public FigureType getFigureType() {
        return FigureType.CIRCLE;
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
        double x = Math.pow((point.getX() - getCenter().getX()), 2);
        double y = Math.pow((point.getY() - getCenter().getY()), 2);
        double R = Math.pow(getRadius(), 2);
        if (x + y <= R) {
            return true;
        } else {
            return false;
        }
    }
}
