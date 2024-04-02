package com.example.producer.service;

import com.example.producer.dto.PersonDto;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class KafkaServiceImpl implements KafkaService {

    private final KafkaTemplate<String, Object> kafkaTemplate;
    private final String topic = "person";

    @Override
    public void send(PersonDto personDto) {
        kafkaTemplate.send(topic, personDto);
    }
}
