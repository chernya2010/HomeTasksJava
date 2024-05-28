package main.java.lesson3.array;
import java.util.Arrays;
/*Создайте два массива из 10 целых случайных чисел из отрезка [0;9] 
и третий массив из 10 действительных чисел. 
Каждый элемент с i-ым индексом третьего массива должен 
равняться отношению элемента из первого массива с i-ым индексом к 
элементу из второго массива с i-ым индексом. 
Вывести все три массива на экран (каждый на отдельной строке), 
затем вывести количество целых элементов в третьем массиве.*/
public class Exercise8 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] array2 = new int[10];
        int min_a = 0; //[0;9]
        int max_a = 9;
        for (int i = 0; i < 10; i++) {
           array[i] = (int) (Math.random() * (max_a - min_a + 1)); //(b - a + 1) + a
        }
        for (int i = 0; i < 10; i++) {
            array2[i] = (int) (Math.random() * (max_a - min_a + 1)); //(b - a + 1) + a
         }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}
