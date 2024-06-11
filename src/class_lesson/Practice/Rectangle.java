package class_lesson.Practice;

public class Rectangle extends GeometricalFigure{
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public void printInformation(){
        System.out.println("ПРИЯМОУГОЛЬНИК");
        System.out.println("Ширина: " + width);
        System.out.println("Высота: " + height);
    }

    public Rectangle(Point center, double width, double height){
        super(center);
        this.width = width;
        this.height = height;
    }

    @Override
    public String getFigureType() {
        return "";//тип фигуры
    }

    @Override
    public double getArea() {
        return 0;//площадь
    }

    @Override
    public double getPerimeter() {
        return 0;//периметр
    }

    @Override
    public boolean containsPoint(Point point) {
        return false;//написать логику, которая будет проверять принадлежит ли точка объекту
    }
}
