package it.nextre.academy.nxtlearn.service.impl;

import it.nextre.academy.myutils.DammiDato;
import it.nextre.academy.nxtlearn.model.Persona;
import it.nextre.academy.nxtlearn.repository.PersonaRepository;
import it.nextre.academy.nxtlearn.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {
    @Autowired
    PersonaRepository personaRepository;

    @Override
    public Persona getRandom() {
        Persona p=new Persona();
        p.setNome(DammiDato.getNome());
        p.setCognome(DammiDato.getCognome());
        p=personaRepository.save(p);
        return p;
    }

    @Override
    public List<Persona> getRandoms(Integer numero) {
        List <Persona> tmp=new ArrayList<>();
        for (int i = 0; i < numero; i++) {
            tmp.add(getRandom());
        }
        return tmp;
    }

    @Override
    public List<Persona> getPersone() {
        return personaRepository.getAll();
    }

    @Override
    public Persona getPersonaById(Integer id) {
        return personaRepository.getPersonaById(id);
    }

    @Override
    public boolean deletePersonaById(Integer id) {
        if(id!=null && id>=0)
            return personaRepository.deletePersonaById(id);
        return false;
    }

    @Override
    public Persona create(Persona p) {
        if(p!=null && p.getId()==null)
            p = personaRepository.create(p);
        return p;
    }

    @Override
    public Persona update(Persona p) {
        if(p!=null && getPersonaById(p.getId())!=null)
            return personaRepository.save(p);
        return null;
    }
}//end class
