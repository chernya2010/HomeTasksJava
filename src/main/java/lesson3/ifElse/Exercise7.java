package main.java.lesson3.ifElse;
/*(Дополнительно) В переменную записываете количество программистов. 
В зависимости от количества программистов необходимо вывести правильно окончание. 
Например:
• 2 программиста
• 1 программиста
• 10 программистов
• и т.д.*/
public class Exercise7 {
    public static void main(String[] args) {
        int a = 551;
        String s1 = String.valueOf(a);
        char lastChar = s1.charAt(s1.length() - 1);

        if ((a == 1 || a > 20) & lastChar == '1') {
            System.out.println(a + " программист");
        } else if ((a < 10 || a > 20) & (lastChar == '2' || lastChar == '3' || lastChar == '4')) {
            System.out.println(a + " программиста");
        } else {
            System.out.println(a + " прграммистов");
        }
    }
}