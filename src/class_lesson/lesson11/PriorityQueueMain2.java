package class_lesson.lesson11;

import java.util.PriorityQueue;

public class PriorityQueueMain2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);

        for (int element : priorityQueue){
            System.out.println(element);
        }

        priorityQueue.remove(2);

        System.out.println();
        System.out.println("After removing");
        for (int element : priorityQueue){
            System.out.println(element);
        }
    }
}
