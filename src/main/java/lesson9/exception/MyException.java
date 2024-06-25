package main.java.lesson9.exception;

public class MyException extends Exception{
    public static void main(String[] args) throws Exception {
        MyException myException = new MyException("Какая то ошибка");
        myException.g();
        myException.f();
    }

    MyException(String message){
        super(message);
    }

    public MyException() {
    }
    /*Создайте метод println(String s), который будет выбрасывать
    MyException с параметром s, а потом ловить это исключение и
    выводить параметр s. Выводите перенос строки в секции finally.*/
    public void println(String s) throws MyException {
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
    public void nullPointer(){
        try {
            MyException exception1 = new MyException();
            exception1 = null;
            exception1.nullPointer();
        } catch (NullPointerException ex){
            System.out.println("NullPointerException thrown successfully");
            throw ex;
        }
    }
    /*Создайте методы f() и g(), так чтобы f() вызывал метод g().
    В методе g() выбросите MyException, словите его в методе f(),
    и там же в catch блоке поделите 1 на 0. Проверьте,
    что при вызове этого метода вылетает ArithmeticException.*/
    public boolean g() throws Exception {
        throw new MyException();
    }

    public void f() throws Exception {
        try {
            g();
        } catch (MyException ex){
            System.out.println(ex.g());
            int a = 1 / 0;
        }
    }


}
