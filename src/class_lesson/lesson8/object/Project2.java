package class_lesson.lesson8.object;

public class Project2 {
    public static void main(String[] args) {
        int[] array = new int[4];
        printInfo(array.getClass());
        printInfo(Integer.class);
    }

    private static void printInfo(Class array){
        System.out.println("Class name " + array.getName());
        System.out.println("Is array " + array.isArray());
        System.out.println("Is interface " + array.isInterface());
        System.out.println("Is primitive " + array.isPrimitive());
    }
}
