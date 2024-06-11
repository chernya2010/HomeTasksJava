package class_lesson.lesson6;

public class Creature {
    private String name;
    private int age;

    public Creature(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("om nom nom");
    }

    public void indntifyCreature(Creature creature){
        if (creature instanceof Human){
            System.out.println("Это человек");
        } else if(creature instanceof Cat){
            System.out.println("Это кот");
        }   else {
            System.out.println("Это кракозябра");
        }
    }

    public Creature(){

    }

}
