package class_lesson.lesson11;

import java.util.PriorityQueue;

public class PriorityQueueMain {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//        priorityQueue.add(1);
//        priorityQueue.add(2);
//        priorityQueue.add(3);

        for (int element : priorityQueue){
            System.out.println(element);
        }
        priorityQueue.remove();

        System.out.println();
        System.out.println("After removing");
        for (int element : priorityQueue){
            System.out.println(element);
        }

        System.out.println();
        System.out.println("PRIORITYQUEUE2");
        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>();
//        priorityQueue2.add(1);
//        priorityQueue2.add(2);
//        priorityQueue2.add(3);

        for (int element : priorityQueue2){
            System.out.println(element);
        }
        priorityQueue2.poll();

        System.out.println();
        System.out.println("After removing");
        for (int element : priorityQueue2){
            System.out.println(element);
        }
    }
}
