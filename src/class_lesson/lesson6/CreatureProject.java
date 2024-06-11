package class_lesson.lesson6;

public class CreatureProject {
    public static void main(String[] args) {
        Creature creature = new Creature();

        Human human = new Human();
        Cat cat = new Cat();

        System.out.println(creature instanceof Creature);
        System.out.println(human instanceof Creature);
        System.out.println(creature instanceof Human);
        System.out.println(cat instanceof Object);

        creature.indntifyCreature(cat);

    }
}
