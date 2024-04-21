package main.java.lesson3.ifElse;
/*Даны 3 целых числа. 
Найти количество положительных чисел в исходном наборе*/
public class Exercise4 {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 15, -25};
        int posNumCount = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] >= 0) {
                posNumCount += 1;
            }
        }
        System.out.println(posNumCount);
    }
}