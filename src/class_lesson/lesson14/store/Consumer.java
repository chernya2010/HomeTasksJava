package class_lesson.lesson14.store;

public class Consumer extends Thread {
    Store store;
    int product = 0;
    Consumer(Store store){
        this.store = store;
    }

    @Override
    public void run(){
        try {
            while (product < 5){
                product = product + store.get();
                System.out.println("Покупателю купил " + product + " товаров");
                sleep(100);
            }
        } catch (InterruptedException ex){
            System.out.println("Поток покупателя прерван");
        }
    }
}
