package it.nextre.academy.nxtlearn.controller;

import it.nextre.academy.nxtlearn.exception.BadRequestException;
import it.nextre.academy.nxtlearn.exception.NotFoundException;
import it.nextre.academy.nxtlearn.model.Persona;
import it.nextre.academy.nxtlearn.service.PersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personaRest")
public class PersonaRestController {

    @Autowired
    PersonaService personaService;
    /*@Autowired
    Logger logger;*/
    Logger logger= LoggerFactory.getLogger(this.getClass());

    @DeleteMapping("/deleteById/{id}")
    public boolean deleteIdPersone(@PathVariable("id")Integer id){
        logger.info("LOG deleteByIdPersone()   id="+id);
        boolean status=personaService.deletePersonaById(id);
            //model.addAttribute("persona",new Persona());
        return status;
    }

    @PostMapping("/createPersona")
    public Persona createPersona(@RequestBody Persona newPersona){
        logger.info("LOG createPersona()");
        if(newPersona!=null && newPersona.getId()==null)
            return personaService.create(newPersona);
        return null;
        //todo fare eccezione bad request
    }

    @GetMapping
    public List<Persona> getPersone(){
        logger.info("LOG getPersone()");
        return personaService.getPersone();
    }
    @PutMapping("/{id}")
    public Persona editPersona(@RequestBody Persona p,@PathVariable ("id") Integer id){
        logger.info("LOG updatePersona() id:"+id);
        if(p!=null && p.getId().equals(id)) {
            Persona tmp = personaService.update(p);
            if (tmp != null)
                return tmp;
            else
                throw new NotFoundException();
        }
        throw new BadRequestException();
    }



}//end class
