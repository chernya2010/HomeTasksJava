package main.java.lesson3.array;
import java.util.Arrays;
/*Создайте массив из 12 случайных целых чисел из отрезка [0;15]. 
Определите какой элемент является в этом массиве 
максимальным и сообщите индекс его последнего вхождения в массив.*/
public class Exercise7 {
    public static void main(String[] args) {
        int[] array = new int[12];
        int min_a = 0; //[0;15]
        int max_a = 15;
        for (int i = 0; i < 12; i++) {
           array[i] = (int) (Math.random() * (max_a - min_a + 1)); //(b - a + 1) + a
        }
        System.out.println(Arrays.toString(array));
        
        int arrMaxVal = Integer.MIN_VALUE;;
        int arrIndexOfMaxValue = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
              int a = array[i]; 
                if (a > arrMaxVal) {
                    arrMaxVal = a;
                    arrIndexOfMaxValue = i;
                }
            }
         }
        System.out.println("Максимальное значение элемента в массиве: " + arrMaxVal);
        System.out.println("Индекс масимального элемента в массиве: " + arrIndexOfMaxValue);
    }
}