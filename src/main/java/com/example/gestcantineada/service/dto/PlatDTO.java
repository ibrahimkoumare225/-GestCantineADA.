package com.example.gestcantineada.service.dto;

import lombok.Data;

import java.time.Instant;

@Data
public class PlatDTO {

    Long id;
    private Instant creation_date;
}
