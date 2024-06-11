package class_lesson.lesson7.interfaces;

public class ButtonClickHandler implements EventHandler{

    @Override
    public void execute() {
        System.out.println("Кнопка нажата");
    }
}
