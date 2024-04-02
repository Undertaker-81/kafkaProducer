package com.example.producer.controller;


import com.example.producer.dto.PersonDto;
import com.example.producer.service.KafkaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class RestPerson {

    private final KafkaService kafkaService;

    @PostMapping
    public void sendPerson(@RequestBody PersonDto personDto) {

        kafkaService.send(personDto);
    }
}
