package it.nextre.academy.nxtlearn.repository;

import it.nextre.academy.nxtlearn.model.Persona;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class PersonaRepositoryMock {
    private List<Persona> db = new ArrayList<>();

    {
        db.add(new Persona(1, "Mario", "Red", new ArrayList<>()));
        db.add(new Persona(2, "Fabio", "Green", new ArrayList<>()));
        db.add(new Persona(3, "Ciuseppe", "Blue", new ArrayList<>()));
        db.add(new Persona(4, "Massimo", "Yellow", new ArrayList<>()));
        db.add(new Persona(5, "Zio", "Bo", new ArrayList<>()));
        db.add(new Persona(6, "Sasso", "Fono", new ArrayList<>()));
    }

    public Persona save(Persona persona) {
        if (persona.getId() != null && persona.getId() > 0) {
            if (db.stream()
                    .map(Persona::getId)
                    .collect(Collectors.toList())
                    .contains(persona.getId())) {
                //posso aggiornare
                Persona tmp = db.stream()
                        .filter(p -> p.getId().equals(persona.getId()))
                        .findFirst()
                        .get();
                tmp.setNome(persona.getNome());
                tmp.setCognome(persona.getCognome());
                return tmp.clone();
            } else {
                //la persona non esiste, Ma volevo aggiornarla
                return null;
            }
        } else {
            //devo inserire
            //calcolare nuovo id
            persona.setId(1 + db.stream()
                    .map(p -> p.getId())
                    .max(Integer::compareTo)
                    .orElse(0));
            db.add(persona);
            return persona.clone();
        }
    }

    public List<Persona> findAll() {
        List<Persona> tmp = new ArrayList<>();
        for (Persona p : db) {
            tmp.add(p.clone());
        }
        return tmp;
    }

    public Optional<Persona> getPersonaById(Integer id) {
        Persona tmp = db.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
        if (tmp != null)
            return Optional.of(tmp.clone());
        else
            return null;
    }

    public void deletePersonaById(Integer id) {
        Persona tmp = getPersonaById(id).orElse(null);
        if (tmp != null) {
            if (!db.remove(tmp))
                throw new RuntimeException();
        }
    }

    /*public Persona create(Persona p) {
        p.setId(1 + db.stream()
                .map(per -> per.getId())
                .max(Integer::compareTo)
                .orElse(0));
        db.add(p);
        return p.clone();
    }*/
}//end class
