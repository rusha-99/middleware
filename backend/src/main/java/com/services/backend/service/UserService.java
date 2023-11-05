package com.services.backend.service;

import com.services.backend.entity.Telcoservices;
import com.services.backend.entity.User;
import com.services.backend.repository.ActivatedservicesRepository;
import com.services.backend.repository.TelcoservicesRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
    @Autowired
    private TelcoservicesRepository telcoservicesRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ActivatedservicesRepository activatedservicesRepository;




    public void deactivateService(String userId, Integer serviceId) {
        activatedservicesRepository.deactivateService(userId,serviceId);
    }
}
