package it.nextre.academy.nxtlearn.service.impl;
import it.nextre.academy.nxtlearn.exception.LivelloNotFoundException;
import it.nextre.academy.nxtlearn.model.Livello;
import it.nextre.academy.nxtlearn.repository.LivelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LivelloServiceImpl{

    @Autowired
    LivelloRepository livelloRepository;

    public Livello findById(Integer id) {
        return livelloRepository.findById(id).orElseThrow(
                () -> new LivelloNotFoundException());
    }

    public List<Livello> getAll() {
        return livelloRepository.findAll();
    }
}//end class