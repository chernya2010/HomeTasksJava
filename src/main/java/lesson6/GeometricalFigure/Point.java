package main.java.lesson6.GeometricalFigure;
//Создайте класс Point с полями (координатами) double x, double y.
public class Point {

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point(){

    }

    public void printInformation(){
        System.out.println("Координаты: " + x + " " + y);
    }
}
