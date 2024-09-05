package com.example.gestcantineada;

import com.example.gestcantineada.model.Plat;
import com.example.gestcantineada.service.MenuService;
import com.example.gestcantineada.service.PlatService;
import com.example.gestcantineada.service.dto.MenuDTO;
import com.example.gestcantineada.service.dto.PlatDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;

@RequiredArgsConstructor
@SpringBootApplication
public class GestCantineAdaApplication implements CommandLineRunner {

    private  final PlatService platService;
    private final MenuService menuService;
    public static void main(String[] args) {
        SpringApplication.run(GestCantineAdaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        PlatDTO plat1 = new PlatDTO();
        plat1.setName("Tchep");
        plat1.setSummary("Senegal");
        platService.save(plat1);

        MenuDTO menuDTO = new MenuDTO();
        menuDTO.setCreation_date(Instant.now());
        menuService.save(menuDTO);
    }
}
