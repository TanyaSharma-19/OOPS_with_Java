import java.util.ArrayList;

public class TicketBook {

    static class TicketBooking {

        private ArrayList<String> tickets = new ArrayList<>();

        public TicketBooking() {
            tickets.add("Ticket 1");
            tickets.add("Ticket 2");
            tickets.add("Ticket 3");
            tickets.add("Ticket 4");
            tickets.add("Ticket 5");
        }

        public synchronized void bookTicket(String customerName) {

            if (!tickets.isEmpty()) {

                System.out.println(customerName + " is booking a ticket...");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                String ticket = tickets.remove(0);

                System.out.println(customerName + " successfully booked " + ticket);
                System.out.println("Tickets remaining: " + tickets.size());

            } else {
                System.out.println(customerName
                        + " could not book a ticket. No tickets available.");
            }
        }
    }

    static class BookingCounter implements Runnable {

        private TicketBooking booking;
        private String customerName;

        public BookingCounter(TicketBooking booking, String customerName) {
            this.booking = booking;
            this.customerName = customerName;
        }

        @Override
        public void run() {
            booking.bookTicket(customerName);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        TicketBooking booking = new TicketBooking();

        Thread t1 = new Thread(
                new BookingCounter(booking, "Customer 1"));

        Thread t2 = new Thread(
                new BookingCounter(booking, "Customer 2"));

        Thread t3 = new Thread(
                new BookingCounter(booking, "Customer 3"));

        Thread t4 = new Thread(
                new BookingCounter(booking, "Customer 4"));

        Thread t5 = new Thread(
                new BookingCounter(booking, "Customer 5"));

        Thread t6 = new Thread(
                new BookingCounter(booking, "Customer 6"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
    }
}