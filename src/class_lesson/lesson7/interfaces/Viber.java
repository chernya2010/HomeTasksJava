package class_lesson.lesson7.interfaces;

public class Viber implements Messenger {
    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в viber");
    }

    @Override
    public void receiveMessage() {
        System.out.println("Получаем сообщение в Viber");
    }
}
