package com.example.gestcantineada.service.mapper;

import com.example.gestcantineada.model.Plat;
import com.example.gestcantineada.service.dto.PlatDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlatMapper extends EntityMapper<PlatDTO, Plat>{
}
