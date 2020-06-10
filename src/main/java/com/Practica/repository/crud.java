package com.Practica.repository;

import java.util.List;
import java.util.Optional;

public abstract class crud <T,E> {
    protected  E repo;

    public crud(E repo)
    {
        this.repo=repo;
    }

    public  abstract List<T> list();
    public abstract  T get(int id);
    public abstract  void add (T o);
    public  abstract  void update (T o,int id);
    public  abstract  void delete(int id);
    public abstract Optional<T> consult(int id);
}
