package com.example.Suppor.Ticket.Admin.Mangament.service;

import com.example.Suppor.Ticket.Admin.Mangament.entity.LoginModule;
import com.example.Suppor.Ticket.Admin.Mangament.repostitory.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginModuleService {

    @Autowired
    private LoginRepository loginRepository;
    public static LoginModule saveLogintModule(LoginModule loginModule) {
        return loginModule;
}


    public List<LoginModule> saveLogintModules(List<LoginModule> loginModules) {

        return  loginRepository.saveAll(loginModules);
    }
}
