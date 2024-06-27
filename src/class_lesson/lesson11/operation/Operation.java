package class_lesson.lesson11.operation;

public class Operation {
    double x;
    double y;

    public double getSum(){
        return x + y;
    }

    public <T extends Number> Operation(T x, T y) {
        this.x = x.doubleValue();
        this.y = y.doubleValue();
    }
}
