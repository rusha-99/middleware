package com.services.backend.controller;

import com.services.backend.entity.Telcoservices;
import com.services.backend.repository.TelcoservicesRepository;
import com.services.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    TelcoservicesRepository telcoservicesRepository;


    @GetMapping("/getAllServices")
    public List<Telcoservices> getServices(){

        return telcoservicesRepository.findAll();
    }
}
