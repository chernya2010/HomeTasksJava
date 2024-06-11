package class_lesson.lesson7.interfaces;

public class Button {
    EventHandler handler;

    Button(EventHandler handler){
        this.handler = handler;
    }

    public void click(){
        handler.execute();
    }
}
