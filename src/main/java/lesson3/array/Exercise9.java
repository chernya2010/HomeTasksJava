package main.java.lesson3.array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.*;
/*Пользователь должен указать с клавиатуры положительное число, 
а программа должна создать массив указанного размера
из случайных целых чисел из [0;15] и вывести его на экран в строку.
После этого программа должна определить и сообщить пользователю о том,
сумма какой половины массива больше: левой или правой, либо сообщить, 
что эти суммы модулей равны. Если пользователь введёт 
неподходящее число, то выдать соответствующее сообщение*/
public class Exercise9 {
    public static void main(String[] args) {
        int arrLength;
        System.out.print("Введите количество элементов в массиве: ");
        Scanner in = new Scanner(System.in);
        arrLength = in.nextInt();
        int[] array = new int[arrLength];
        int min_a = 0; //[0;15]
        int max_a = 15;
        if (arrLength % 2 == 0) {
            for (int i = 0; i < arrLength; i++) {
                array[i] = (int) (Math.random() * (max_a - min_a + 1)); //(b - a + 1) + a
             }
             System.out.println(Arrays.toString(array));
        
        int separator = arrLength / 2;
        int[] splitArrayPart1 = Arrays.copyOfRange(array, 0, separator);
        int[] splitArrayPart2 = Arrays.copyOfRange(array, separator, array.length);

        for (int i = 0; i < array.length / 2; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(splitArrayPart1));
        System.out.println(Arrays.toString(splitArrayPart2));

        double sumArr1 = IntStream.of(splitArrayPart1).sum();
        double sumArr2 = IntStream.of(splitArrayPart2).sum();

        if (sumArr1 > sumArr2) {
            System.out.println("Сумма элементов первой половины массива, больше суммы элементов второй половины массива");
        } else if (sumArr1 < sumArr2) {
            System.out.println("Сумма элементов второй половины массива, больше суммы элементов первой половины массива");
        } else if (sumArr1 == sumArr2) {
            System.out.println("Сумма элементов первой половины массива, равна сумме элементов второй половины массива");
        }
        } else if (arrLength % 2 != 0) {
            System.out.println("Вы ввели нечётное число");
        }    
    }
}