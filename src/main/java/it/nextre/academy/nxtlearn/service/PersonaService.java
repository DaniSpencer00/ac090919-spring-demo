package it.nextre.academy.nxtlearn.service;

import it.nextre.academy.nxtlearn.dto.PersonaDto;
import it.nextre.academy.nxtlearn.model.Persona;

import java.util.List;

public interface PersonaService {
    Persona getRandom();

    List<Persona> getRandoms(Integer numero);

    List<Persona> getPersone();

    Persona getPersonaById(Integer id);

    boolean deletePersonaById(Integer id);

    Persona create(Persona newPersona);

    Persona update(Persona p);

    PersonaDto toDto(Persona p);
}
