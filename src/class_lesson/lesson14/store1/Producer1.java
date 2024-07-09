package class_lesson.lesson14.store1;

public class Producer1 implements Runnable{
    Store1 store1;

    public Producer1(Store1 store1) {
        this.store1 = store1;
    }

    @Override
    public void run() {
        for(int i = 1; i < 6; i++){
            if(i < 6){
                store1.put();
            }
        }
    }
}
