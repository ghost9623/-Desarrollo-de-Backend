package com.Practica.services;

import com.Practica.models.pacientes;
import com.Practica.repository.crud;
import com.Practica.repository.pacienterepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class Servicespacientes extends crud<pacientes, pacienterepository> {
    public Servicespacientes(pacienterepository repo) {
        super(repo);
    }

    @Override
    public List<pacientes> list() {
        return null;
    }

    @Override
    public pacientes get(int id) {
        return null;
    }

    @Override
    public void add(pacientes o) {

    }

    @Override
    public void update(pacientes o, int id) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Optional<pacientes> consult(int id) {
        return Optional.empty();
    }
}
