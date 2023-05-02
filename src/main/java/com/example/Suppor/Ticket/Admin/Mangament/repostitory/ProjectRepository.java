package com.example.Suppor.Ticket.Admin.Mangament.repostitory;

import com.example.Suppor.Ticket.Admin.Mangament.entity.ProjectModule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<ProjectModule , Integer> {
}
