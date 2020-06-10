package com.Practica.repository;

import com.Practica.models.pacientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface pacienterepository extends JpaRepository<pacientes,Integer> {
}
