package class_lesson.lesson7.interfaces;

public class ErrorMonitoringSystem implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг ошибок стартовал");
    }
}
