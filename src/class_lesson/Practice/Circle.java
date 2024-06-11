package class_lesson.Practice;

public class Circle extends GeometricalFigure{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void printInformation(){
        System.out.println("КРУГ");
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
        return "";
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
