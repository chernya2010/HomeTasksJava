package class_lesson.lesson10.practice;

public class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car model: " + model;
    }
}
