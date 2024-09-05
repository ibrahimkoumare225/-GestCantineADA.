package com.example.gestcantineada.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String summary;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "plat_id")
    private Plat plat;
}
