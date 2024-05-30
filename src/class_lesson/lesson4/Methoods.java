package class_lesson.lesson4;

public class Methoods {
    public int factorial(){
        return 1;
    }

    public void hello(){
        System.out.println("Hello");
    }

    int square(int i){
        return i * i;
    }

    int getSum(int ...numbers){
        int result = 0;
        for(int number : numbers){
            result+=number;
        }
        return result;
    }

    public static void main(String[] args) {
        Methoods methods = new Methoods();
        System.out.println(methods.square(5));

        int number = methods.getSum(10,20);
        System.out.println(number);
    }
}
