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
    public boolean printInformation(){
        System.out.println("Тип фигуры: " + getFigureType());
        System.out.println("Ширина: " + width);
        System.out.println("Высота: " + height);
        System.out.println("Площадь прямоугольника: " + getArea());
        System.out.println("Периметр прямоугольника: " + getPerimeter());
        return false;
    }

    public Rectangle(Point center, double width, double height){
        super(center);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Point center, double height){
        super(center);
        this.height = height;
    }

    @Override
    public FigureType getFigureType() {
        return FigureType.RECTANGLE;//тип фигуры
    }

    @Override
    public double getArea() {
        return width * height;//площадь
    }

    @Override
    public double getPerimeter() {
        double per = (width*2) + (height*2);
        return per;//периметр
    }

    @Override
    public boolean containsPoint(Point point) {
        if((point.getX() <= getCenter().getX()*2) && ((point.getY() <= getCenter().getY()*2))){
            return true;
        } else {
            return false;
        }
    }
}
