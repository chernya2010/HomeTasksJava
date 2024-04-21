package main.java.lesson3.array;
import java.util.Arrays;
/*Создайте массив из 4 случайных целых чисел из отрезка [0;10], 
выведите его на экран в строку. 
Определить и вывести на экран сообщение о том, 
является ли массив строго возрастающей последовательностью.*/
public class Exercise6 {
    public static void main(String[] args) {
        int[] array = new int[4];
        int min_a = 0; //[0;10]
        int max_a = 10;
        for (int i = 0; i < 4; i++) {
           array[i] = (int) (Math.random() * (max_a - min_a + 1)); //(b - a + 1) + a
        }
        System.out.println(Arrays.toString(array));
        
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1] | array[i] == array[i+1]) {
                System.out.printf("Число %d больше либо равно следующего(му) в последовательности %d. " + "Массив не возрастающий" + "\n",  array[i], array[i+1]);
                break;
            } else {
                System.out.println("Массив является возрастающей последовательностью."); 
            }
         }
    }
}
