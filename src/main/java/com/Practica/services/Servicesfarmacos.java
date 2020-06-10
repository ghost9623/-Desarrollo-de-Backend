package com.Practica.services;

import com.Practica.models.farmacos;
import com.Practica.repository.crud;
import com.Practica.repository.farmacorepository;
import javassist.tools.framedump;

import java.util.List;
import java.util.Optional;

public class Servicesfarmacos extends crud<farmacos, farmacorepository> {
    public Servicesfarmacos(farmacorepository repo) {
        super(repo);
    }

    @Override
    public List<farmacos> list() {
        return repo.findAll();
    }

    @Override
    public farmacos get(int id) {
        return repo.findById(id).get();
    }

    @Override
    public void add(farmacos o) {
        repo.save(o);
    }

    @Override
    public void update(farmacos o, int id) {

        o.setId(id);

        repo.save(o);
    }

    @Override
    public void delete(int id) {
        repo.deleteById(id);
    }

    @Override
    public Optional<farmacos> consult(int id) {
        return repo.findById(id);
    }
}
