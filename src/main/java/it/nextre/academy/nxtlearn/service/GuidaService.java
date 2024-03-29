package it.nextre.academy.nxtlearn.service;

import it.nextre.academy.nxtlearn.model.Guida;

import java.util.List;

public interface GuidaService {

    Guida findById(Integer id);

    List<Guida> getAll();

    Guida newGuida(Guida g);

    Guida update(Guida g);

    boolean deleteById(Integer id);
}