package com.Practica.models;

import javax.persistence.*;

@Entity
@Table(name="farmacos")
public class farmacos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="nombre", columnDefinition = "varchar(50) not null")
    private String nombre;

    @Column(name="nombrec", columnDefinition = "varchar(50) not null")
    private String nombrec;
    @Column(name="dosis", columnDefinition = "varchar(60) not null")
    private String dosis;
    @Column(name="paciente", columnDefinition = "int not null")
    private String paciente;

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

    public String getNombrec() {
        return nombrec;
    }

    public void setNombrec(String nombrec) {
        this.nombrec = nombrec;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }
}
