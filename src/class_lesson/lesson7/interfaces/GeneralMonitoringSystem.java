package class_lesson.lesson7.interfaces;

public class GeneralMonitoringSystem implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг общий стартовал");
    }
}
