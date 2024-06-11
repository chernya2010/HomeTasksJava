package class_lesson.lesson7.interfaces;

public class Journal implements Printable{
    private String name;

    public Journal(String name){
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("print из класса Journal");
    }

    public String getName() {
        return name;
    }
}
