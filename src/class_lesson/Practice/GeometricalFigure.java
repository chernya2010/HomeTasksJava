package class_lesson.Practice;

public abstract class GeometricalFigure {
    private Point center;

    public Point getCenter() {
        return center;
    }

    public GeometricalFigure(){

    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void printInformation(){
        System.out.println("КАКАЯ-ТО ФИГУРА");
        System.out.println("Координата x: " + getCenter().getX());
        System.out.println("Координата y: " + getCenter().getY());
        System.out.println("Центр: " + this.center);
    }

    public GeometricalFigure(Point center){
        this.center = center;
    }

    public abstract String getFigureType();
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract boolean containsPoint(Point point);
}
