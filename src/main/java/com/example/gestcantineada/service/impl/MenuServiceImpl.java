package com.example.gestcantineada.service.impl;

import com.example.gestcantineada.model.Menu;
import com.example.gestcantineada.repository.MenuRepository;
import com.example.gestcantineada.service.MenuService;
import com.example.gestcantineada.service.dto.MenuDTO;
import com.example.gestcantineada.service.mapper.MenuMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@Service
public class MenuServiceImpl implements MenuService {
    private final MenuRepository menuRepository;

    private final MenuMapper menuMapper;
    @Override
    public MenuDTO save(MenuDTO menuDTO) {
        Menu menu = menuMapper.toEntity(menuDTO);
        menu = menuRepository.save(menu);
        return menuMapper.toDto(menu);
    }

    @Override
    public MenuDTO update(MenuDTO menuDTO) {
        return findOne(menuDTO.getId()).map(existingMenu->{
            existingMenu.setCreation_date(menuDTO.getCreation_date());
            return save(existingMenu);
        }).orElseThrow(()->new IllegalArgumentException());
    }

    @Override
    public void delete(Long id) {
        menuRepository.deleteById(id);

    }

    @Override
    public Optional<MenuDTO> findOne(Long id) {
        return menuRepository.findById(id).map(menu -> {
            return menuMapper.toDto(menu);
        });
    }

    @Override
    public List<MenuDTO> findAll() {
        return menuRepository.findAll().stream().map(menu -> {
            return menuMapper.toDto(menu);
        }).toList();
    }
}
