package main.java.lesson8.сosmodrome;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Timer;

public class Cosmodrome implements IStart{
    public static void main(String[] args) {
        launch(new IStart() {
            @Override
            public boolean prelaunchSystemCheck() {
                return IStart.super.prelaunchSystemCheck();
            }

            @Override
            public void engineStart() {
                IStart.super.engineStart();
            }

            @Override
            public void start() {
                IStart.super.start();
            }
        });
    }

    public static void launch(IStart iStart){

        if (iStart.prelaunchSystemCheck() == false){
            System.out.println("Предстартовая проверка провалена");
        } else {
            System.out.println("Предстартовая проверка прошла успешно");
            iStart.engineStart();
            iStart.start();
        }
    }
}
