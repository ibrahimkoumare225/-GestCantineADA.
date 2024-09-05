package com.example.gestcantineada.controller;

import com.example.gestcantineada.repository.MenuRepository;
import com.example.gestcantineada.service.MenuService;
import com.example.gestcantineada.service.dto.MenuDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping
@RequiredArgsConstructor
@Controller
public class MenuController {

    private final MenuService menuService;
    @GetMapping("/menusHome")
    public String menu(Model model){
        List<MenuDTO> menus = menuService.findAll();
        model.addAttribute("menus",menus);
        return "pages/menus";
    }
}
