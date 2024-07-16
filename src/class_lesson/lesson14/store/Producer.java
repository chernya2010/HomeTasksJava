package class_lesson.lesson14.store;

import class_lesson.lesson11.printer.Printer;

public class Producer extends Thread{
    Store store;
    int product = 5;
    Producer(Store store){
        this.store = store;
    }

    @Override
    public void run(){
        try {
            while (product > 0){
                product = product - store.put();
                System.out.println("Производителю осталось произвести " + product + " товаров");
                sleep(100);
            }
        } catch (InterruptedException ex){
            System.out.println("Поток производителя прерван");
        }
    }
}
