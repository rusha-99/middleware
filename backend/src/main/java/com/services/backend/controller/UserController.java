package com.services.backend.controller;

import com.services.backend.entity.Activatedservices;
import com.services.backend.entity.Telcoservices;
import com.services.backend.repository.ActivatedservicesRepository;
import com.services.backend.repository.TelcoservicesRepository;
import com.services.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

   // @Autowired


    @Autowired
    TelcoservicesRepository telcoservicesRepository;

    @Autowired
    ActivatedservicesRepository activatedservicesRepository;


    @GetMapping("/getAllServices")
    public List<Telcoservices> getServices(){

        return telcoservicesRepository.findAll();
    }

    @PostMapping("/activateService/{userId}/{serviceId}")
    public String activateService(@PathVariable String userId, @PathVariable Integer serviceId) {
        Activatedservices activatedService = new Activatedservices();
        activatedService.setUserId(userId);
        activatedService.setServiceId(serviceId);

        activatedservicesRepository.save(activatedService);

        return "Service activated successfully.";
    }


    @DeleteMapping("/deactivateService/{userId}/{serviceId}")
    public String deactivateService(@PathVariable String userId, @PathVariable Integer serviceId){

        userService.deactivateService(userId,serviceId);
        return "Service deactivated successfully";
    }
}
