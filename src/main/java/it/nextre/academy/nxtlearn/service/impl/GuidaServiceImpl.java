package it.nextre.academy.nxtlearn.service.impl;

import it.nextre.academy.nxtlearn.model.Guida;
import it.nextre.academy.nxtlearn.repository.GuidaRepository;
import it.nextre.academy.nxtlearn.service.GuidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuidaServiceImpl implements GuidaService {

    @Autowired
    GuidaRepository guidaRepository;


    @Override
    public Guida findById(Integer id) {
        Guida guide = guidaRepository.findById(id).orElse(null);
        return guide;
    }

    @Override
    public List<Guida> getAll() {
        return guidaRepository.findAll();
    }

    @Override
    public Guida newGuida(Guida g) {
        if (g != null && g.getId() == null) {
            g = guidaRepository.save(g);
            return g;
        }
        return null;
    }

    @Override
    public Guida update(Guida g) {
        if (g != null && findById(g.getId()) != null) {
            return guidaRepository.save(g);
        }
        return null;
    }

    public boolean deleteById(Integer id) {
        if (id != null && id > 0) {
            try {
                guidaRepository.deleteById(id);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }

    public List<Guida> getGuide() {
        return guidaRepository.findAll();
    }
}//end class