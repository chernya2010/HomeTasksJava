package class_lesson.lesson5;

public class Bicycle {
    private String model;
    private int weight;
    private int seatPostDiameter;

    Bicycle(String model, int weight){
        this.model = model;
        this.weight = weight;
    }
    Bicycle(String model, int weight, int seatPostDiameter){
        this.model = model;
        this.weight = weight;
        this.seatPostDiameter = seatPostDiameter;
    }

    public void start(){
        System.out.println("Поехали");
    }

    public class StiringWheel{
        public void right(){
            System.out.println("Руль вправо");
        }
        public void left(){
            System.out.println("Руль влево");
        }
    }
    public Seat createSeat(){
        return new Seat();
    }

    public class Seat{
        public void up(){
            System.out.println("Сидение поднято выше");
        }
        public void down(){
            System.out.println("Сидение опущено ниже");
        }
        public void getSeatParameter(){
            System.out.println("Параметр сидения: " + Bicycle.this.seatPostDiameter);
        }
    }
}
