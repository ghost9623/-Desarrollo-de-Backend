package com.Practica.restcontrollers;

import com.Practica.models.farmacos;
import com.Practica.services.Servicesfarmacos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/farmacos")
public class farmacoRestcontrollers {
    @Autowired
    Servicesfarmacos  serv;

    @GetMapping("/list")
    public List<farmacos> list()
    {
        return serv.list();
    }

    public farmacos get(int id)
    {
        return serv.get(id);
    }


    @PostMapping("/add")
    public void  add(@RequestBody farmacos far)
    {
        serv.add(far);
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody farmacos far,@PathVariable int id)
    {
        serv.update(far,id);
    }

    @DeleteMapping("/delete/{id}")
    public void  delete(@PathVariable int id)
    {
        serv.delete(id);
    }

    @GetMapping("/consult/{id}")
    public Optional<farmacos> consult(@PathVariable int id)
    {
        return serv.consult(id);
    }
}






