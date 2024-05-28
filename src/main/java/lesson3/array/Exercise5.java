package main.java.lesson3.array;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.*;
/*Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый, 
выведите массивы на экран в двух отдельных строках. 
Посчитайте среднее арифметическое суммы элементов каждого массива и сообщите, 
для какого из массивов это значение оказалось больше 
(либо сообщите, что их средние арифметические равны).*/
public class Exercise5 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int min_a = 0; //[0;15]
        int max_a = 15;
        for (int i = 0; i < 5; i++) {
           array[i] = (int) (Math.random() * (max_a - min_a + 1)); //(b - a + 1) + a
        }

        int[] array2 = new int[5];
        int min_b = 0; //[0;15]
        int max_b = 15;
        for (int i = 0; i < 5; i++) {
           array2[i] = (int) (Math.random() * (max_b - min_b + 1)); //(b - a + 1) + a
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        
        double sumArr1 = IntStream.of(array).sum();
        double sumArr2 = IntStream.of(array2).sum();
        double average1 = sumArr1 / array.length;
        double average2 = sumArr2 / array2.length;


        if (average1 > average2) {
            System.out.println("Среднее арифметическое больше у первого массива");
        } else if (average1 < average2) {
            System.out.println("Среднее арифметическое больше у второго массива");
        } else if (average1 == average2) {
            System.out.println("Среднее арифметическое массивов равно");
        }
    }
}
