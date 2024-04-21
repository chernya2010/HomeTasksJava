package main.java.lesson3.ifElse;
/*Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей. 
Определить существует ли такой треугольник. 
Дано: a, b, c – стороны предполагаемого треугольника. 
Требуется сравнить длину каждого отрезка-стороны с суммой двух других. 
Если хотя бы в одном случае отрезок окажется больше суммы двух других, то треугольника с такими сторонами не существует.*/
public class Exercise2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 4;

        if ((b + c > a) && (a + c > b) && (a + b > c)) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
    }
}