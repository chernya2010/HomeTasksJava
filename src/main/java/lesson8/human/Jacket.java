package main.java.lesson8.human;

public interface Jacket {

    default void putOn(){
        System.out.println("Куртка надета");
    };

    default void takeOff(){
        System.out.println("Куртка снята");
    }
}
