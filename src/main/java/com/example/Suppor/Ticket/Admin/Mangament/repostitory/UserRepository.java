package com.example.Suppor.Ticket.Admin.Mangament.repostitory;

import com.example.Suppor.Ticket.Admin.Mangament.entity.UserModule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModule,Integer> {
}
