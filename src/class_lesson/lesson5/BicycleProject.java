package class_lesson.lesson5;

public class BicycleProject {
    public static void main(String[] args) {
        Bicycle aist = new Bicycle("Аист", 120);
        Bicycle.StiringWheel wheel = aist.new StiringWheel();
        Bicycle.Seat seat = aist.new Seat();

        seat.up();
        aist.start();
        wheel.left();
        wheel.right();

        Bicycle bicycle = new Bicycle("Аист", 120, 10);
        Bicycle.Seat seat1 = bicycle.new Seat();
        seat1.getSeatParameter();
    }
}
