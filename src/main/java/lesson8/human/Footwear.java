package main.java.lesson8.human;

public interface Footwear {

    default void putOn(){
        System.out.println("Обувь надета");
    }

    default void takeOff(){
        System.out.println("Обувь снята");
    }
}
