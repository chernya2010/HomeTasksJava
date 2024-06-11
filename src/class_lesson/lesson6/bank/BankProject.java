package class_lesson.lesson6.bank;

public class BankProject {
    public static void main(String[] args) {
        Object employee = new Employee1("Валера", "Пупкин", "Приор");
        Person1 person1 = new Client1("Вася", "Верёвкин", "Альфабанк");

        ((Employee1)employee).displayInfo();
        person1.displayInfo();

        String bank = ((Client1)person1).getBank();

        Employee1 man = new Manager1("Вая", "Альфабанк");

        man.displayInfo();

       // Manager1 manager1 = new Employee1("Кто ты", "Банк");
    }
}
