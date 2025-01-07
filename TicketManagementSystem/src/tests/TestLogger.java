package tests;

import core.TicketPool;


public class TestLogger {
    public static void main (String[] args) throws InterruptedException {
        TicketPool ticketPool = new TicketPool();

        System.out.println("Adding tickets to the ticket pool\n");
        ticketPool.addTickets("1");
        ticketPool.addTickets("2");
        ticketPool.addTickets("3");

        Thread.sleep(5000);
        System.out.println("\nRemoving tickets from the ticket pool\n");
        ticketPool.removeTicket();
        ticketPool.removeTicket();
    }

}
