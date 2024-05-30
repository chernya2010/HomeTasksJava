package class_lesson.lesson4;

public class Overload {
    void test(){
        System.out.println("Параметры отсутствуют");
    }
    //перегружаемый метод с одним параметром
    void test(int a){
        System.out.println("a: " + a);
    }
    //перегружаемый метод с двумя параметрами
    void test(int a, int b){
        System.out.println("a: " + a + ", b: " + b);
    }

    void test(double a) {
        System.out.println("a: " + a);
    }
}
