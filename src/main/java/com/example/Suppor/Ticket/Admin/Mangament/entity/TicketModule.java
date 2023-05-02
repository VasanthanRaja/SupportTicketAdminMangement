package com.example.Suppor.Ticket.Admin.Mangament.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name ="TicketModule")
public class TicketModule {

      @Id
      @GeneratedValue
      private int id;

      private String title;
      private String description;
      private String projectName;
      private String assignedTo;
      private String priority;
      private String status;
      private String type;

      public String getTitle() {
            return title;
      }

      public void setTitle(String title) {
            this.title = title;
      }

      public String getDescription() {
            return description;
      }

      public void setDescription(String description) {
            this.description = description;
      }

      public String getProjectName() {
            return projectName;
      }

      public void setProjectName(String projectName) {
            this.projectName = projectName;
      }

      public String getAssignedTo() {
            return assignedTo;
      }

      public void setAssignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
      }

      public String getPriority() {
            return priority;
      }

      public void setPriority(String priority) {
            this.priority = priority;
      }

      public String getStatus() {
            return status;
      }

      public void setStatus(String status) {
            this.status = status;
      }

      public String getType() {
            return type;
      }

      public void setType(String type) {
            this.type = type;
      }
}
