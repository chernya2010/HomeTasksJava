package main.java.lesson8.robot;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        RobotSony robotSony = new RobotSony(new SonyHead(100), new SamsungHand(200), new ToshibaLeg(300));
        System.out.println("Это робот " + robotSony.getName());
        robotSony.action();
        System.out.println("Модель " + robotSony.getName() + " стоит: " + robotSony.getPrice());
        System.out.println("--------------------------------------------------------------------------------------------");
        RobotSamsung robotSamsung = new RobotSamsung(new SamsungHead(100), new ToshibaHand(20), new SonyLeg(30));
        System.out.println("Это робот " + robotSamsung.getName());
        robotSamsung.action();
        System.out.println("Модель " + robotSamsung.getName() + " стоит: " + robotSamsung.getPrice());
        System.out.println("--------------------------------------------------------------------------------------------");
        RobotToshiba robotToshiba = new RobotToshiba(new ToshibaHead(1), new SonyHand(2), new SamsungLeg(3));
        System.out.println("Это робот " + robotToshiba.getName());
        robotToshiba.action();
        System.out.println("Модель " + robotToshiba.getName() + " стоит: " + robotToshiba.getPrice());
        int largestInt = Math.max(robotSony.getPrice(), Math.max(robotToshiba.getPrice(), robotSamsung.getPrice()));
        System.out.println("--------------------------------------------------------------------------------------------");
        if (largestInt == robotSamsung.getPrice()){
            System.out.println("Самый дорогой робот: " + robotSamsung.getName());
        } else if (largestInt == robotSony.getPrice()) {
            System.out.println("Самый дорогой робот: " + robotSony.getName());
        } else if (largestInt == robotToshiba.getPrice()) {
            System.out.println("Самый дорогой робот: " + robotToshiba.getName());
        }

    }
}
