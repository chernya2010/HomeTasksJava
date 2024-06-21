package main.java.lesson6.GeometricalFigure;

public class Square extends Rectangle{

    public Square(Point centre, double width, double height) {
        super(centre, width, height);

    }
    }

    @Override
    public void printInformation(){
        System.out.println("Тип фигуры: " + getFigureType());
        System.out.println("Высота стороны квадрата: " + getHeight());
        System.out.println("Площадь квадрата: "+ getArea());
        System.out.println("Периметр квадрата: " + getPerimeter());
    }

    @Override
    public String getFigureType() {
        return "Квадрат";//тип фигуры
    }

    @Override
    public double getArea() {
        return getHeight() * getHeight();//площадь
    }

    @Override
    public double getPerimeter() {
        double per = getHeight()*4;
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
