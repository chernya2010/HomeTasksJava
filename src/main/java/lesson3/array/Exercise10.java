package main.java.lesson3.array;
import java.util.Arrays;
import java.util.Scanner;
/*Пользователь вводит с клавиатуры число большее 3, 
которое сохраняется в переменную n. 
Если пользователь ввёл не подходящее число, то программа 
должна выдать соответствующее сообщение. 
Создать массив из n случайных целых чисел из отрезка [0;n] 
и вывести его на экран. Создать второй массив только из 
чётных элементов первого массива, если они там есть, 
и вывести его на экран.*/
public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        if (n > 3){
            int[] array = new int[n];
            int min_a = 0; //[0;n]
            int max_a = n;
            
            for (int i = 0; i < n; i++) {
                array[i] = (int) (Math.random() * (max_a - min_a + 1)); //(b - a + 1) + a
            }
            System.out.println(Arrays.toString(array));
            int evenNums = 0;
            for (int i = 0; i < n; i++) {
                if(array[i] % 2 == 0){
                   evenNums++;
                }
            }
            int [] dest = new int[evenNums];
            int index = 0;
            for (int i = 0; i < n; i++) {
                if(array[i] % 2 == 0){
                   dest[index] = array[i];
                   index++;
                }
            }
            System.out.println(Arrays.toString(dest));
        } else {
            System.out.println("Вы ввели число меньше либо равное \"3\"");
        }
    }
}