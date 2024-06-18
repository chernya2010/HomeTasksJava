package class_lesson.lesson9.Exception;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Мухтар");
        dog.putCollar();
        dog.putMuzzle();
        try {
            dog.walk();
        } catch (DogIsNotReadyException e){
            System.out.println(e.getMessage());
        }

    }
}
