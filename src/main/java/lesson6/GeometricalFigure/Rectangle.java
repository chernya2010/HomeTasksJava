package main.java.lesson6.GeometricalFigure;
//Создайте класс Rectangle и наследуйте его от GeomerticalFigure. Добавьте в него поля double width и double height.
public class Rectangle extends GeometricalFigure{
    private double width;
    private double height;

    public Rectangle() {

    }

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
    //Переопределите метод printInformation для класса Rectangle.
    @Override
    public void printInformation(){
        System.out.println("Тип фигуры: " + getFigureType());
        System.out.println("Ширина: " + width);
        System.out.println("Высота: " + height);
        System.out.println("Площадь прямоугольника: " + getArea());
    }

    public Rectangle(Point centre, double width, double height){
        super(centre);
        this.width = width;
        this.height = height;
    }

    @Override
    public String getFigureType() {
        return "Прямоугольник";//тип фигуры
    }

    @Override
    public double getArea() {
        return width * height;//площадь
    }

    @Override
    public double getPerimeter() {
        return 0;//периметр
    }

    @Override
    public boolean containsPoint(Point point) {
        return false;
    }
}
