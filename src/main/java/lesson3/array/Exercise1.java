package main.java.lesson3.array;
/*Создайте массив из всех чётных чисел от 2 до 20 
и выведите элементы массива на экран сначала в строку, 
отделяя один элемент от другого пробелом, а затем в столбик 
(отделяя один элемент от другого началом новой строки). 
Перед созданием массива подумайте, какого он будет размера.*/
public class Exercise1 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for(int i=0; i <= 9; i++) {
            array[i] = i * 2 + 2;
        }
        String res_row = "";
        for(int num: array){
            res_row += (num + " ");
        }
        System.out.print(res_row);//вывод в строку

        System.out.println("\n");//отступ в консоли

        String res_col = "";
        for(int num: array){
            res_col += (num + "\n");
        }
        System.out.print(res_col);//вывод в столбик
     }
}