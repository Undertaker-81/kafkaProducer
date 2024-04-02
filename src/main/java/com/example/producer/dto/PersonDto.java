package com.example.producer.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PersonDto {
    private String name;
    private String surname;
    private String middlename;
    private LocalDate birthdate;
}
