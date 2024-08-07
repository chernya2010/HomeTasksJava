package class_lesson.lesson14.store;

public class Store {
    int counter = 0;
    final int N = 5;

    synchronized int put(){
        if (counter <= N){
            counter++;
            System.out.println("Магазин имеет " + counter + " товар(ов)");
            return 1;
        } return 0;
    }

    synchronized int get(){
        if (counter > 0){
            counter--;
            System.out.println("Магазин имеет " + counter + " товар(ов)");
            return 1;
        } return 0;
    }
}
