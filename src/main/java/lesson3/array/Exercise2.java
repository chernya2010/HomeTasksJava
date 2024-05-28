package main.java.lesson3.array;
/*Создайте массив из всех нечётных чисел от 1 до 99, 
выведите его на экран в строку, 
а затем этот же массив выведите на экран тоже в строку, 
но в обратном порядке (99 97 95 93 … 7 5 3 1).*/
public class Exercise2 {
    public static void main(String[] args) {
        int[] array = new int[50];

        for(int i=0; i <= 49; i++) {
            array[i] = i * 2 + 1;
        }
        String res_row = "";
        for(int i: array){
            res_row += (i + " ");
        }
        System.out.print(res_row);//вывод в строку

        System.out.println("\n");//отступ в консоли

        String rev_res_row = "";
        for(int i = array.length - 1; i >= 0; i--) {
            rev_res_row += (array[i] + " ");
        }
        System.out.print(rev_res_row);//реверсивный вывод в строку
    }   
}
