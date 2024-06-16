package class_lesson.lesson8.object;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        int age = 18;
        System.out.println(age);

//        String s = String.valueOf(18);
//        String result = "Age is " + age;
//        System.out.println(result);

        Student student = new Student("Ivan");
        System.out.println(student);

        Man man = new Man("blue", 123);
        Man man1 = new Man("blue", 124);
        Man man2 = new Man("blue", 123);
        Women woman = new Women("blue", 123);
        System.out.println(man.equals(woman));
        System.out.println(man.equals(man1));
        System.out.println(man.equals(man2));
        System.out.println();
        Auto ferrari1 = new Auto("Ferrari1", 90000, 2009);
        Auto ferrari2 = new Auto("Ferrari1", 90000, 2009);
        System.out.println(ferrari1.equals(ferrari2));
        System.out.println(ferrari1.hashCode());
        System.out.println(ferrari2.hashCode());

        Car1 car = new Car1("Грузовик", new Driver("Ivan", 18));
        Car1 clonedCar = car.clone();
        System.out.println("car1: " + car);
        System.out.println("clonedCar: " + clonedCar);

        Driver clonedCarDriver = clonedCar.getDriver();
        clonedCarDriver.setName("Петя");
        System.out.println("Клонированный водитель: "+clonedCar);

        System.out.println("-------------------------------------------");
        Car1 car1 = new Car1("Легковая", new Driver("Петя", 30));
        Car1 car2 = new Car1(car1);
        System.out.println(car1);
        System.out.println(car2);
        car2.setDriver(new Driver("Ivan", 25));
        System.out.println(car1);
        System.out.println(car2);
    }
}
