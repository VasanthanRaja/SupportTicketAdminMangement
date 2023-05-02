package com.example.Suppor.Ticket.Admin.Mangament.controller;

import com.example.Suppor.Ticket.Admin.Mangament.entity.ProjectModule;
import com.example.Suppor.Ticket.Admin.Mangament.entity.TicketModule;
import com.example.Suppor.Ticket.Admin.Mangament.entity.UserModule;
import com.example.Suppor.Ticket.Admin.Mangament.service.LoginModuleService;
import com.example.Suppor.Ticket.Admin.Mangament.service.ProjectModuleService;
import com.example.Suppor.Ticket.Admin.Mangament.service.TicketModuleService;
import com.example.Suppor.Ticket.Admin.Mangament.service.UserModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ApiController {

    @Autowired
    private TicketModuleService ticketModuleService;

    @Autowired
    private UserModuleService userModuleService;

    @Autowired
    private ProjectModuleService projectModuleService;

    @Autowired
    private LoginModuleService loginModuleService;

    @PostMapping("/addTicket")
    public TicketModule addTicketModule(@RequestBody TicketModule ticketModule){
        return ticketModuleService.saveTicketModule(ticketModule);
    }

    @PostMapping("/addUser")
    public UserModule addUserModule(@RequestBody UserModule userModule){
        return userModuleService.saveUserModule(userModule);
    }


    @PostMapping("/addProject")
    public ProjectModule projectModule(@RequestBody ProjectModule projectModule){
        return projectModuleService.saveProjectModule(projectModule);
    }

    @GetMapping("/getTicket")
    public List<TicketModule> findAllProducts(){

        return ticketModuleService.getTicket();
    }



    @GetMapping("/getTicket/{id}")
    public TicketModule findTicketById(@PathVariable int id){
        return ticketModuleService.getTicketById(id);
    }

    @GetMapping("/getUser/{id}")
    public UserModule findUserById(@PathVariable int id){
        return userModuleService.getUserById(id);
    }

    @GetMapping("/getProject/{id}")
    public ProjectModule findProjectById(@PathVariable int id){
        return projectModuleService.getProjectById(id);
    }



    @GetMapping("/getTicketByTitle/{title}")
    public List<TicketModule> findTicketByTitle(@PathVariable String title){
        return ticketModuleService.getTicketByTitle(title);
    }

    @PutMapping("/Update")
    public TicketModule updateTicketModule(@RequestBody TicketModule ticketModule){
        return ticketModuleService.updateTicketModule(ticketModule);
    }

    @PutMapping("/UpdateUser")
    public UserModule updateUserModule(@RequestBody UserModule userModule) {
        return userModuleService.updateUserModule(userModule);
    }


    @PutMapping("/UpdateProject")
    public ProjectModule updateProjectModule(@RequestBody ProjectModule projectModule) {
        return projectModuleService.updateProjectModule(projectModule);
    }


   @DeleteMapping("/delete/{id}")
    public String deleteTicketById(@PathVariable int id){
        return ticketModuleService.deleteTicketModuleByid(id);
    }


    @DeleteMapping("/deleteUser/{id}")
    public String deleteUserById(@PathVariable int id){
        return userModuleService.deleteUserModuleById(id);
    }

    @DeleteMapping("/deleteProject/{id}")
    public String deleteProjectById(@PathVariable int id){
        return projectModuleService.deleteProjectModuleById(id);
    }

    }
