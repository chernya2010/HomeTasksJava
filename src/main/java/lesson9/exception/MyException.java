package main.java.lesson9.exception;

import java.util.ArrayList;

public class MyException extends Exception{
    public static void main(String[] args) throws Exception {
        println("Ошибка из метода println");
        nullPointer();
        f();
//        wrapException(new RuntimeException());
//        unwrapException(new MyException());
        generateArrayOutOfBoundsException(1);
    }

    MyException(String message){
        super(message);
    }

    public MyException() {
    }
    /*Создайте метод println(String s), который будет выбрасывать
    MyException с параметром s, а потом ловить это исключение и
    выводить параметр s. Выводите перенос строки в секции finally.*/
    public static void println(String s) throws MyException {
        try {
            throw new MyException(s);
        } catch (Exception ex){
            System.out.println(s);
        } finally {
            System.out.println();
        }
    }
    /*Создайте метод nullPointer(), который будет создавать объект (любой),
    инициализировать его null, пытаться вызвать метод у этого объекта,
    ловить NullPointerException и выводить в catch блоке сообщение
    "NullPointerException thrown successfully".*/
    public static void nullPointer(){
        try {
            String str = null;
            str.length();
        } catch (NullPointerException ex){
            System.out.println("NullPointerException thrown successfully");
            throw ex;
        }
    }
    /*Создайте методы f() и g(), так чтобы f() вызывал метод g().
    В методе g() выбросите MyException, словите его в методе f(),
    и там же в catch блоке поделите 1 на 0. Проверьте,
    что при вызове этого метода вылетает ArithmeticException.*/
    public static void g() throws MyException {
        throw new MyException("Текст ошибки");
    }
    public static void f(){
        int a = 0;
        try {
            g();
        } catch (MyException ex) {
            int b = 10 / a;
        }
    }

    /*Создайте метод wrapException(Exception e),
    который будет возвращать RuntimeException,
    созданный с аргументом е в конструкторе.*/
    public static void wrapException(Exception e){
        throw new RuntimeException(e);
    }

    /*Создайте метод unwrapException(Exception e),
     который будет выбрасывать сause исключения e.*/
    public static void unwrapException(Exception e){
        try {
            nullPointer();
        } catch (Exception ex){
            throw new RuntimeException("Перехвачено исключение: " + ex);
        }
    }

    /*Создайте метод generateArrayOutOfBoundsException(int i),
    который будет пытаться обратиться к i-му элементу массива
    и выбрасывать исключение, потому что такого элемента в
    массиве нет.*/
    public static void generateArrayOutOfBoundsException(int i){
        int[] m = {i};
        try {
            m[10] = 999;
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Ошибка! Индекс за пределами массива\n" + exception);
        }
    }

}
