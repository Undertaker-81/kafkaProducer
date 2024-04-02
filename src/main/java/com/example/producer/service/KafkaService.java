package com.example.producer.service;

import com.example.producer.dto.PersonDto;

public interface KafkaService {

    void send(PersonDto personDto);
}
