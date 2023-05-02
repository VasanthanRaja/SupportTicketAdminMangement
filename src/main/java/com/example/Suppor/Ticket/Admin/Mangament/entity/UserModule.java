package com.example.Suppor.Ticket.Admin.Mangament.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "UserModule")

public class UserModule {

    @Id
    @GeneratedValue
    private  int id;
    private String name;
    private String email;
    private String role;
}
