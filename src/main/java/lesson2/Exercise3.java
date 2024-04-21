package main.java.lesson2;

public class Exercise3 {
    public static void main(String[] args) {
        int x = 9;
        int x1 = x++;
        int y = 21;
        int y1 = y--;
        boolean a = false & false;
        boolean b = false & true;
        boolean c = true & false;
        boolean d = true & true;
        boolean e = false | false;
        boolean f = false | true;
        boolean g = true | false;
        boolean h = true | true;
        boolean i = false ^ false;
        boolean j = false ^ true;
        boolean k = true ^ false;
        boolean l = true ^ true;
        System.out.println(x1 + "\n" + x + "\n" + y1 + "\n" + y + "\n" + a + "\n" + b + "\n" + c + "\n" + d + 
        "\n" + e + "\n" + f + "\n" + g + "\n" + h + "\n" + i + "\n" + j + "\n" + k + "\n" + l);
    }
}
