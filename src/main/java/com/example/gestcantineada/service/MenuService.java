package com.example.gestcantineada.service;

import com.example.gestcantineada.service.dto.MenuDTO;

import java.util.List;
import java.util.Optional;

public interface MenuService {

    MenuDTO save(MenuDTO menuDTO);

    MenuDTO update(MenuDTO menuDTO);

    //List<MenuDTO> findByNom(String query , String genre);
    void delete(Long id);

    Optional<MenuDTO> findOne(Long id);

    List<MenuDTO> findAll();

}
