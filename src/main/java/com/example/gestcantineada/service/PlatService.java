package com.example.gestcantineada.service;

import com.example.gestcantineada.service.dto.PlatDTO;

import java.util.List;
import java.util.Optional;

public interface PlatService {

    PlatDTO save(PlatDTO platDTO);

    PlatDTO update(PlatDTO platDTO);

    //List<MenuDTO> findByNom(String query , String genre);
    void delete(Long id);

    Optional<PlatDTO> findOne(Long id);

    List<PlatDTO> findAll();
}
