package com.api.services;

import com.api.model.ResponseMessage;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RegistrationService {
    private static final Logger log = LoggerFactory.getLogger(RegistrationService.class);

    @Autowired
    ResponseMessage response;

    public ResponseMessage registerService(Map<String, String> data) {
        log.info("Registration service is called");
        ObjectMapper mapper = new ObjectMapper();

        response.setResponseCode(0);
        response.setResponseMsg("Register successfully");

        return response;
    }
}