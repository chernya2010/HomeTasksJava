package class_lesson.lesson11.tickets;

public class PurchaseTicketSystem<T extends ITicket> {
    T[] tickts;

    public PurchaseTicketSystem(T[] tickts) {
        this.tickts = tickts;
    }

    public void purchaseTicketSystemInfo() {
        for(ITicket ticket : tickts){
            System.out.println(ticket.getType());
        }
    }
}
