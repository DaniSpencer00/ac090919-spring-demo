package it.nextre.academy.nxtlearn.service.impl;

import it.nextre.academy.myutils.DammiDato;
import it.nextre.academy.nxtlearn.dto.PersonaDto;
import it.nextre.academy.nxtlearn.model.Persona;
import it.nextre.academy.nxtlearn.repository.PersonaRepository;
import it.nextre.academy.nxtlearn.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {
    @Autowired
    PersonaRepository personaRepository;

    @Override
    public Persona getRandom() {
        Persona p = new Persona();
        p.setNome(DammiDato.getNome());
        p.setCognome(DammiDato.getCognome());
        p = personaRepository.save(p);
        return p;
    }

    @Override
    public List<Persona> getRandoms(Integer numero) {
        List<Persona> tmp = new ArrayList<>();
        for (int i = 0; i < numero; i++) {
            tmp.add(getRandom());
        }
        return tmp;
    }

    @Override
    public List<Persona> getPersone() {
        return personaRepository.findAll();
    }

    @Override
    public Persona getPersonaById(Integer id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deletePersonaById(Integer id) {
        if (id != null && id >= 0) {
            try {
                personaRepository.deletePersonaById(id);
                return true;
            } catch (RuntimeException e) {
                return false;
            }
        }
        return false;
    }

    @Override
    public Persona create(Persona p) {
        if (p != null && p.getId() == null)
            p = personaRepository.save(p);
        return p;
    }

    @Override
    public Persona update(Persona p) {
        if (p != null && getPersonaById(p.getId()) != null)
            return personaRepository.save(p);
        return null;
    }

    @Override
    public PersonaDto toDto(Persona tmp) {
        PersonaDto dto = new PersonaDto();
        dto.setId(tmp.getId());
        dto.setNome(tmp.getNome());
        dto.setCognome(tmp.getCognome());
        tmp.getGuide().forEach(el->{
            HashMap guida = new HashMap();
            guida.put("id", el.getGuida().getId());
            guida.put("nome", el.getGuida().getNome());
            guida.put("url", el.getGuida().getUrl());
            guida.put("imagePath", el.getGuida().getImagePath());
            guida.put("descrizione", el.getGuida().getDescrizione());
            dto.getGuide().add(guida);
        });
        return dto;
    }
}//end class
