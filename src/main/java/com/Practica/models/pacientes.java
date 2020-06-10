package com.Practica.models;

import javax.persistence.*;

@Entity
@Table(name="pacientes")
public class pacientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="nombre", columnDefinition = "varchar(50) not null")
    private String nombre;

    @Column(name="edad", columnDefinition = "int not null")
    private String edad;
    @Column(name="medico", columnDefinition = "varchar(60) not null")
    private String medico;
    @Column(name="sintomas", columnDefinition = "varchar(60) not null")
    private String sintomas;

    public pacientes() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
}
