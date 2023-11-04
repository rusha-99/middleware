package com.services.backend.service;

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
}
