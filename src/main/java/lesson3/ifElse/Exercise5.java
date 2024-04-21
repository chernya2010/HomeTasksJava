package main.java.lesson3.ifElse;
/*Даны 3 целых числа. 
Найти количество положительных и отрицательных чисел в исходном наборе.*/
public class Exercise5 {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 15, -25};
        int posNumCount = 0;
        int negNumCount = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] >= 0) {
                posNumCount += 1;
            } else if (arr1[i] < 0) {
                negNumCount += 1;
            }
        }
        System.out.println("Положительных чисел: " + posNumCount);
        System.out.println("Отрицательных чисел: " + negNumCount);
    }
}
