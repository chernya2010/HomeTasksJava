package class_lesson.lesson3;

public class lesson3 {

    public static void main(String[] args) {
        
        /*int[] array = new int[]{1, 2, 3, 4, 5};
        for (int i1 : array){
            System.out.println(i1);
        }
        System.out.println("-----------------------");

        //while
        int n = 10;
        int a = 25;
        int b = 20;

        while (n > 0) {
            System.out.println("Hello" + n);
            n--;
        }

        while (a > b) {
            System.out.println("Мы в цикле");
            a--;
        }

        for (int i = 0; i<3; i++){
            System.out.print("Итерация" + i + ": ");
            for (int j = 0; j<10; j++){
                if (j==4){
                    break;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
*/
        for(int i = 0; i < 10; i++){
            if (i == 2){
                continue;
            }
            System.out.println(i);
        }
    }

}
