package com.example.gestcantineada.model;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private Instant creation_date;

    @OneToOne
    private Plat plat;
}
