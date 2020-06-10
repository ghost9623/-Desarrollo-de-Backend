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
        return repo.findAll();
    }

    @Override
    public pacientes get(int id) {
        return repo.findById(id).get();
    }

    @Override
    public void add(pacientes o) {
      repo.save(o);
    }

    @Override
    public void update(pacientes o, int id) {

        o.setId(id);

        repo.save(o);
    }

    @Override
    public void delete(int id) {
        repo.deleteById(id);
    }

    @Override
    public Optional<pacientes> consult(int id) {
        return repo.findById(id);
    }
}
