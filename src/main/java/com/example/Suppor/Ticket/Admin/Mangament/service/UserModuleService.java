package com.example.Suppor.Ticket.Admin.Mangament.service;

import com.example.Suppor.Ticket.Admin.Mangament.entity.UserModule;
import com.example.Suppor.Ticket.Admin.Mangament.repostitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserModuleService {

    @Autowired
    private UserRepository userRepository;

    public UserModule saveUserModule (UserModule userModule){
        System.out.println("user module to string");
        return userRepository.save(userModule);
    }


    public UserModule getUserById(int id) {
        return userRepository.findById(id).orElse(null);    }

    public UserModule updateUserModule(UserModule userModule) {
        System.out.println("userModule.getId()22 "+userModule.getId());
        UserModule existingUser = userRepository.findById(userModule.getId()).orElse(null);
        existingUser.setName(userModule.getName());
        existingUser.setEmail(userModule.getEmail());
        existingUser.setRole(userModule.getRole());

        return userRepository.save(existingUser);
    }

    public String deleteUserModuleById(int id) {
        userRepository.deleteById(id);
        return "User removed by id " +id;
    }
}
