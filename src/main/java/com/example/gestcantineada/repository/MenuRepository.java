package com.example.gestcantineada.repository;

import com.example.gestcantineada.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu,Long> {
}
