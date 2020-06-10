package com.Practica.restcontrollers;


import com.Practica.models.farmacos;
import com.Practica.models.pacientes;

import com.Practica.services.Servicesfarmacos;
import com.Practica.services.Servicespacientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pacientes")
public class pacienteRestcontrollers {

    @Autowired
    Servicespacientes serv;

    @GetMapping("/list")
    public List<pacientes> list()
    {
        return serv.list();
    }

    public pacientes get(int id)
    {
        return serv.get(id);
    }


    @PostMapping("/add")
    public void  add(@RequestBody pacientes far)
    {
        serv.add(far);
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody pacientes far,@PathVariable int id)
    {
        serv.update(far,id);
    }

    @DeleteMapping("/delete/{id}")
    public void  delete(@PathVariable int id)
    {
        serv.delete(id);
    }

    @GetMapping("/consult/{id}")
    public Optional<pacientes> consult(@PathVariable int id)
    {
        return serv.consult(id);
    }
}

