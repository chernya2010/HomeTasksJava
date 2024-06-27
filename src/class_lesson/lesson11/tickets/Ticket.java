package class_lesson.lesson11.tickets;

public class Ticket implements ITicket{
    @Override
    public String getType() {
        return type;
    }
    private Integer id;
    private String type;
    private String destination;
    private String purchseDate;

    public Ticket(Integer id, String type, String destination, String purchseDate) {
        this.id = id;
        this.type = type;
        this.destination = destination;
        this.purchseDate = purchseDate;
    }

}
