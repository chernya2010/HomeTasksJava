package main.java.lesson3.array;
import java.util.Arrays;
/*Создайте массив из 20 случайных целых чисел из отрезка [0;20]. 
Выведите массив на экран в строку. 
Замените каждый элемент с нечётным индексом на ноль. 
Снова выведете массив на экран на отдельной строке.*/
public class Exercise4 {
    public static void main(String[] args) {
        int[] array = new int[20];
        int min = 0; //[0;20]
        int max = 20;
        for (int i = 0; i < 20; i++) {
           array[i] = (int) (Math.random() * (max - min + 1)); //(b - a + 1) + a
        }

        int[] dest = array.clone();//клонируем исходный массив
        for (int i = 0; i < dest.length; i++) {
            if (i % 2 == 0) {
                dest[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println(Arrays.toString(dest));
    }
}
