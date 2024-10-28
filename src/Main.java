public class Main {
    public static void main(String[] args) {
        ConcertTicket ticket = new ConcertTicket("Jakarta International Stadium", 1250000, 220);
        Seat number = new Seat(ticket, "CAT A");

        number.showSeatNumber();
        ticket.applyStockAdjustment(10);
        number.showSeatNumber();
        System.out.println("One Direction");
    }
}
