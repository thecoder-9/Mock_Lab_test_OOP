package core;


import logging.Logger;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TicketPool implements TicketOperation {
    private final List<String> tickets = Collections.synchronizedList(new LinkedList<>());

    @Override
    public synchronized void addTickets(String ticket) {
        tickets.add(ticket);
        Logger.log("Ticket ID: " + ticket + " | Operation Type: Add");
    }

    @Override
    public synchronized String removeTicket() {
        String ticket = tickets.isEmpty() ? null : tickets.remove(0);

        Logger.log("Ticket ID: " + ticket + " | Operation Type: Remove");

        return ticket;
    }

    public int getTicketCount() {
        return tickets.size();
    }
}