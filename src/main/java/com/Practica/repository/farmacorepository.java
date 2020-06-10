package com.Practica.repository;

import com.Practica.models.farmacos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface farmacorepository extends JpaRepository<farmacos,Integer> {
}
