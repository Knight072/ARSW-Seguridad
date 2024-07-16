package co.edu.escuelaing.interactiveblackboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @Autowired
    TicketRepository ticketRepo;

    @GetMapping("/getticket")
    public String getTicket() {
        System.out.println("llega");
        return "{\"ticket\":\"" + ticketRepo.getTicket() + "\"}";
    }
}
