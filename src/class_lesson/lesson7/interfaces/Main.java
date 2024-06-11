package class_lesson.lesson7.interfaces;

public class Main {
    private static final int ERROR_COUNT = 10;

    public static void main(String[] args) {
        Book book = new Book("sdfsfd", "ssdf", 5);
        book.print();

        Journal journal = new Journal("dsfgsdfgasdf");

        journal.print();
        journal.prin1();

        Printable.read();

        GeneralMonitoringSystem generalMonitoringSystem = new GeneralMonitoringSystem();
        ErrorMonitoringSystem errorMonitoringSystem = new ErrorMonitoringSystem();
        SecurityMonitoringSystem securityMonitoringSystem = new SecurityMonitoringSystem();
        generalMonitoringSystem.startMonitoring();
        errorMonitoringSystem.startMonitoring();
        securityMonitoringSystem.startMonitoring();

        MonitoringSystem general = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг общий стартовал");
            }

            int getCurrentErrorCount(){
                return ERROR_COUNT;
            }
        };

        MonitoringSystem error = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг ошибок стартовал");
            }
        };

        MonitoringSystem security = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг безопасности стартовал");
            }
        };

        general.startMonitoring();
        error.startMonitoring();
        security.startMonitoring();
    }
}
