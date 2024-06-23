package main.java.lesson6.GeometricalFigure;
//Создайте класс GeometricalFigure с полем center типа Point.
public abstract class GeometricalFigure implements Printable {
    private Point center;
    /*Объявите метод getCenter() в классе GeometricalFigure финальным.
    Убедитесь, что его невозможно переопределить в классах-наследниках.*/
    final Point getCenter() {
        return center;
    }

    public GeometricalFigure(){}

    public void setCenter(Point center) {
        this.center = center;
    }
    //Добавьте в класс GeometricalFigure метод printInformation(), который будет выводить информацию о фигуре в общем.
    public boolean printInformation(){
        System.out.println("КАКАЯ-ТО ФИГУРА");
        System.out.println("Координата x: " + getCenter().getX());
        System.out.println("Координата y: " + getCenter().getY());
        System.out.println("Центр: " + this.center);
        return false;
    }

    public GeometricalFigure(Point center){
        this.center = center;
    }

    public abstract FigureType getFigureType();
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract boolean containsPoint(Point point);
}
