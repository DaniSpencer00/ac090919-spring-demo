package it.nextre.academy.nxtlearn.controller;

import it.nextre.academy.nxtlearn.dto.PersonaDto;
import it.nextre.academy.nxtlearn.exception.BadRequestException;
import it.nextre.academy.nxtlearn.exception.NotFoundException;
import it.nextre.academy.nxtlearn.exception.PersonaNotFoundException;
import it.nextre.academy.nxtlearn.model.Persona;
import it.nextre.academy.nxtlearn.service.impl.PersonaServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/personaRest")
public class PersonaRestController {
    @Autowired
    PersonaServiceImpl personaService = new PersonaServiceImpl();
    // todo creare un bean conosciuto da spring in modo da collegarlo al logger
    Logger logger = LoggerFactory.getLogger(this.getClass());

    //   @Autowired
    //   Logger logger;

    @DeleteMapping({"/removeById/{id}", "/deleteById/{id}"})
    public Persona deleteById(@PathVariable("id") Integer id) {
        logger.info("LOG: deleteById, id=" + id);
        Persona tmp = personaService.getPersonaById(id);
        if (tmp != null) {
            personaService.deletePersonaById(id);
            return tmp;
        } else {
            //System.out.println("sasso");
            throw new PersonaNotFoundException();
        }
    }


    @PostMapping({"/add", "/create"})
    public Persona addOne(@RequestBody @Valid Persona tmp, BindingResult validator) {
        logger.debug("LOG: addOne()");

        if (validator.hasErrors()) {
            logger.debug("LOG: validator.hasErrors()");
            String errs = validator.getAllErrors()
                    .stream()
                    .map(e -> e.getDefaultMessage())
                    .collect(Collectors.joining(", "));
            throw new BadRequestException(errs);
        }



        if (tmp != null) {
            personaService.create(tmp);
        }
        return tmp;
    }


    @GetMapping({"/findById/{id}", "/{id}", "/getById/{id}", "/get/{id}"})
    public PersonaDto getByID(@PathVariable("id") Integer id) {
        logger.debug("GET Persona.getOne() with id: "+id);
        Persona tmp = personaService.getPersonaById(id);
        if (tmp!=null) {
            return personaService.toDto(tmp);
        } else
            throw new PersonaNotFoundException();
    }


    @GetMapping({"/", "/all"})
    public List<Persona> getPersone() {
        logger.info("Log: getPersone()");
        return personaService.getPersone();
    }

    @PutMapping("/update/{id}")
    public Persona editOne(@RequestBody Persona p, @PathVariable("id") Integer id) {
        logger.info("Log: update()");
        if (p != null && p.getId().equals(id)) {
            Persona tmp = personaService.update(p);
            if (tmp != null) {
                return tmp;
            } else {
                throw new NotFoundException();
            }
        }
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
    }

}//end class