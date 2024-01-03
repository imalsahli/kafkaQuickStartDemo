package com.example.democab.service;

import com.example.democab.constant.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public boolean updatedLocation(String location){
        kafkaTemplate.send(AppConstant.CAB_LOCATION, location);
        return true;
    }
}
