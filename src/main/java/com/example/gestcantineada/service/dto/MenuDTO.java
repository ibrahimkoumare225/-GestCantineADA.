package com.example.gestcantineada.service.dto;

import com.example.gestcantineada.model.Plat;
import lombok.Data;

import java.time.Instant;

@Data
public class MenuDTO {

    Long id;
    private Instant creation_date;

    private Plat plat;
}
