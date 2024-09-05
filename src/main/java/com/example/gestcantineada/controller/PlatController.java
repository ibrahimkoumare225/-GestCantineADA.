package com.example.gestcantineada.controller;

import com.example.gestcantineada.service.PlatService;
import com.example.gestcantineada.service.dto.MenuDTO;
import com.example.gestcantineada.service.dto.PlatDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping
public class PlatController {

        private final PlatService platService;
    @GetMapping("/platHome")
    public String platHome(Model model){
        List<PlatDTO> plats = platService.findAll();
        model.addAttribute("plats",plats);
        return "pages/plats";
    }

    @GetMapping("/updatePlat")
    public String updatePlats(){

        return "pages/forms";
    }
    @GetMapping("/plat/{id}")
    public String showUpdateStudentForms(Model model, @PathVariable Long id){
        Optional<PlatDTO> plat = platService.findOne(id);
        if (plat.isPresent()){
            model.addAttribute("plats" , plat.get());
            return "pages/plats";
        } else {
            return "redirect:/platHome";
        }
    }

    @PostMapping("/deletePlat/{id}")
    public String deleteStudent(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        platService.delete(id);
        return "redirect:/platHome";
    }
}
