package com.example.Suppor.Ticket.Admin.Mangament.service;

import com.example.Suppor.Ticket.Admin.Mangament.entity.LoginModule;
import com.example.Suppor.Ticket.Admin.Mangament.entity.TicketModule;
import com.example.Suppor.Ticket.Admin.Mangament.repostitory.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketModuleService {

    @Autowired
    private TicketRepository ticketRepository;

    public TicketModule saveTicketModule(TicketModule ticketModule) {

        return ticketRepository.save(ticketModule);

    }




    public TicketModule getTicketById(int id) {
        return ticketRepository.findById(id).orElse(null);
    }

    public TicketModule updateTicketModule(TicketModule ticket) {
        TicketModule existingTicket = ticketRepository.findById(ticket.getId()).orElse(null);
        existingTicket.setTitle(ticket.getTitle());
        existingTicket.setDescription(ticket.getDescription());
        existingTicket.setProjectName(ticket.getProjectName());
        existingTicket.setAssignedTo(ticket.getAssignedTo());
        existingTicket.setPriority(ticket.getPriority());
        existingTicket.setStatus(ticket.getStatus());
        existingTicket.setType(ticket.getType());

        System.out.println("existingTicket22 "+ existingTicket.toString());

        return ticketRepository.save(existingTicket);
    }


    public String deleteTicketModuleByid(int id) {
        ticketRepository.deleteById(id);
        return "Ticket removed by id " +id;

    }

    public List<TicketModule> getTicket() {
        return ticketRepository.findAll();
    }

    public List<TicketModule> getTicketByTitle(String title) {
        return ticketRepository.findByTitle(title);
    }
}
