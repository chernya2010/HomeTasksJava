package class_lesson.lesson7.interfaces;

public class Whatsup implements Messenger{
    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в whatsup");
    }

    @Override
    public void receiveMessage() {
        System.out.println("Получаем сообщение в whatsup");
    }
}
