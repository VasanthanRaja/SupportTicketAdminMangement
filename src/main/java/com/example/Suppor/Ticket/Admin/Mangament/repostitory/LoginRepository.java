package com.example.Suppor.Ticket.Admin.Mangament.repostitory;

import com.example.Suppor.Ticket.Admin.Mangament.entity.LoginModule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<LoginModule ,Integer> {
}
