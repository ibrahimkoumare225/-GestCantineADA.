package com.example.gestcantineada.service.dto;

import com.example.gestcantineada.model.Plat;
import lombok.Data;

@Data
public class MenuDTO {
    Long id;
    String name;
    String summary;

    private Plat plat;
}
