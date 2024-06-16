package class_lesson.lesson8.object;

public class Student {
    private String name;

    Student(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student " + name;
    }
}
