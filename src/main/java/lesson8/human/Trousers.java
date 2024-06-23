package main.java.lesson8.human;

public interface Trousers {

    default void putOn(){
        System.out.println("Штаны надеты");
    }

    default void takeOff(){
        System.out.println("Штаны сняты");
    }
}
