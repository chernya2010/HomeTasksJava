package class_lesson.lesson7.interfaces;

public class Client {
//    private Viber viber;
//    private Telegram telegram;
//    private Whatsup whatsup;

    private Messenger messanger;

    public Client(){
        this.messanger = new Telegram();
    }
}
