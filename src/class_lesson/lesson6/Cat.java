package class_lesson.lesson6;

public class Cat extends Creature{

    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0){
            this.age = age;
        }else{
            System.out.println("Некорректный возраст");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void sayMyau(){
        System.out.println("myau");
    }
}
