package class_lesson.lesson7.interfaces;

public class SecurityMonitoringSystem implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг безопасности стартовал");
    }
}
