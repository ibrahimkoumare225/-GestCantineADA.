package com.example.gestcantineada.service.impl;

import com.example.gestcantineada.model.Plat;
import com.example.gestcantineada.repository.PlatRepository;
import com.example.gestcantineada.service.PlatService;
import com.example.gestcantineada.service.dto.PlatDTO;
import com.example.gestcantineada.service.mapper.PlatMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PlatServiceImpl implements PlatService {

    private final PlatRepository platRepository;
    private  final PlatMapper platMapper;
    @Override
    public PlatDTO save(PlatDTO platDTO) {
        Plat plat = platMapper.toEntity(platDTO);
        plat = platRepository.save(plat);
        return platMapper.toDto(plat);
    }

    @Override
    public PlatDTO update(PlatDTO platDTO) {
        return findOne(platDTO.getId()).map(existingPlat->{
            existingPlat.setName(platDTO.getName());
            existingPlat.setSummary(platDTO.getSummary());
            return save(existingPlat);
        }).orElseThrow(()->new IllegalArgumentException());
    }

    @Override
    public void delete(Long id) {
        platRepository.deleteById(id);
    }

    @Override
    public Optional<PlatDTO> findOne(Long id) {
        return platRepository.findById(id).map(plat -> {
            return platMapper.toDto(plat);
        });
    }

    @Override
    public List<PlatDTO> findAll() {
        return platRepository.findAll().stream().map(plat -> {
            return platMapper.toDto(plat);
        }).toList();
    }
}
