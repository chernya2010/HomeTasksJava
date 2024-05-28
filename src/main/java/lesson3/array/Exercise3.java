package main.java.lesson3.array;
import java.util.Arrays;
/*Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. 
Выведите массив на экран. 
Подсчитайте сколько в массиве чётных элементов 
и выведете это количество на экран на отдельной строке.*/
public class Exercise3 {
    public static void main(String[] args) {
        int[] array = new int[15];
        int min = 0; //[0;99]
        int max = 99;
        for (int i = 0; i < 15; i++) {
           array[i] = (int) (Math.random() * (max - min + 1)); //(b - a + 1) + a
        }

        int countEven = 0;
        for(int i = 0; i < array.length; i++) {
            if ((array[i] % 2 ) == 0) {
                countEven += 1;
            }     
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("Количество чётных элементов в массиве: " + countEven);
    }
}