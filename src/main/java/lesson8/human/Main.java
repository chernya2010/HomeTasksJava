package main.java.lesson8.human;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Валера", "Куртка", "Штаны", "Башмаки");

        human.putOn();
        human.takeOff();
    }
}
