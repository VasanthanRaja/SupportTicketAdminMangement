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
@Table (name="projectModule")

public class  ProjectModule {

    @Id
    @GeneratedValue
    private int id;

    private String projectName;
    private String description;
    private String location;

}
