package class_lesson.lesson9.Exception;

public class Exception4 {
    static String helloWorld(){
        try {
            return "trying string";
        } catch (Exception e){
            return "catch string";
        } finally {
            return "finaly String";
        }
    }

    public static void main(String[] args) {
        System.out.println(helloWorld());
    }
}
