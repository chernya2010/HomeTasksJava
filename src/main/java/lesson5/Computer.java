package main.java.lesson5;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String processor;
    private String ram;
    private String hdd;
    private int workFullCycle = 3;

    public Computer(){
    }

    public void description(String processor, String ram, String hdd, int workFullCycle){
        System.out.println("Характеристики компьютера:");
        System.out.println("Процессор: " + processor);
        System.out.println("Оперативная память: " + ram);
        System.out.println("Жесткий диск: " + hdd);
        System.out.println("Ресурс полных циклов работы: " + workFullCycle);
        System.out.println();//отступ
    }

    public boolean computerON(){
        boolean isOn;
        do {
            Random random = new Random();
            int i = random.nextInt(2);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Чтобы компьютер включился, угадайте число: ");
            int n = scanner.nextInt();
            if (n == i) {
                isOn = true;
                System.out.println("Компьютер включился");
                System.out.println();//отступ
                break;
            } else {
                isOn = false;
                workFullCycle--;
                if(workFullCycle > 0){
                    System.out.println("Не угадали. Осталось попыток: " + workFullCycle);
                } else {
                    System.out.println("Попытки закончились. Компьютер сгорел");
                }
            }
        } while (workFullCycle > 0);
        return isOn;
    }

    public void computerOFF(){
        do {
            Random random = new Random();
            int i = random.nextInt(2);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Чтобы компьютер выключился, угадайте число: ");
            int n = scanner.nextInt();
            if (n == i) {
                System.out.println("Компьютер выключился");
                break;
            } else {
                workFullCycle--;
                if(workFullCycle > 0){
                    System.out.println("Не угадали. Осталось попыток: " + workFullCycle);
                } else {
                    System.out.println("Попытки закончились. Компьютер сгорел");
                }
            }
        } while (workFullCycle > 0);
    }
}
