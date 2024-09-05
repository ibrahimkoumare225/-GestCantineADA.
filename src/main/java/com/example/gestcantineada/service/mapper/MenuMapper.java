package com.example.gestcantineada.service.mapper;


import com.example.gestcantineada.model.Menu;
import com.example.gestcantineada.service.dto.MenuDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MenuMapper extends EntityMapper<MenuDTO, Menu>{
}
