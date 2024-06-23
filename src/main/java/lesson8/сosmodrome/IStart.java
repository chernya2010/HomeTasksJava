package main.java.lesson8.сosmodrome;

import java.util.Random;
import java.util.Scanner;

public interface IStart {

    default boolean prelaunchSystemCheck(){
        Random rand = new Random();
        int randomNumber = rand.nextInt(10);
        if (randomNumber > 3){
            return true;
        }
        return false;
    }

    default void engineStart(){
        int i = 10;
        while (i >= 0) {
            System.out.println(i--);
        }
        System.out.println("Двигатели Шатла запущены. Все системы в норме");

    }

    default void start(){
        System.out.println("Старт Шатла");
    }
}
