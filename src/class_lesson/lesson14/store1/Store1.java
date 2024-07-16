package class_lesson.lesson14.store1;

public class Store1 {
    private int product = 0;
    private boolean available = false;

    public synchronized void get(){
        while (product < 1){
            try {
                wait();
            } catch (InterruptedException ex) {

            }
        }
        product--;
        System.out.println("Покупатель купил 1 товар");
        System.out.println("Продуктов осталось на складе " + product);
        notify();
    }

    public synchronized void put(){
        while (product >= 3){
            try {
                wait();
            } catch (InterruptedException ex) {

            }
        }
        product++;
        System.out.println("Продавец положил на склад 1 товар");
        System.out.println("Продуктов осталось на складе " + product);
        notify();
    }
}
