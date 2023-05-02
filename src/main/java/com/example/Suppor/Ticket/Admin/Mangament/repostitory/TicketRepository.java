package com.example.Suppor.Ticket.Admin.Mangament.repostitory;

import com.example.Suppor.Ticket.Admin.Mangament.entity.TicketModule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository <TicketModule , Integer>{
    List<TicketModule> findByTitle(String title);

}
