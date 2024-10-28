public class ConcertTicket implements PrintTicketDetails {
    public String category;
    public double price;
    public int stock;
    public ConcertTicket(String category, double price, int stock) {
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public void printTicketDetails() {

        System.out.println("Category: " + category);
        System.out.println("Price: Rp" + price);
        System.out.println("Discounted Price: Rp" + price * 0.8);
        System.out.println("Stock: " + stock);
    }

    public void applyStockAdjustment(int adjustment) {
        stock += getAdjustment(adjustment);
        System.out.println("Stock adjusted. New stock: " + stock);
    }

    private static int getAdjustment(int adjustment) {
        return adjustment;
    }
}
class Seat {
    public ConcertTicket ticket;
    public String seatNumber;
    public Seat(ConcertTicket ticket, String seatNumber) {
        this.ticket = ticket;
        this.seatNumber = seatNumber;
    }

    public void showSeatNumber() {
        System.out.println("Station: " + seatNumber);
        ticket.printTicketDetails();
    }
}
