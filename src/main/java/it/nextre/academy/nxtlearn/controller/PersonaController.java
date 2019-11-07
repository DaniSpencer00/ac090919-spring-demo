package it.nextre.academy.nxtlearn.controller;

import it.nextre.academy.nxtlearn.exception.PersonaNotFoundException;
import it.nextre.academy.nxtlearn.model.Persona;
import it.nextre.academy.nxtlearn.service.PersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/persona")
public class PersonaController {
    /*@Autowired
    Logger logger;*/
    Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonaService personaService;

    @GetMapping("/new")
    public String getNewPersona(Model model){
        logger.info("LOG getNewPersona()");
        model.addAttribute("persona",personaService.getRandom());
        return "persona.html";
    }

    @GetMapping("/new/{qta}")
    public String getNewPersone(Model model, @PathVariable("qta")Integer qta){
        logger.info("LOG getNewPersone()");
        model.addAttribute("persone",personaService.getRandoms(qta));
        return "persone.html";
    }
    @GetMapping("/findById/{id}")
    public String getIdPersone(Model model, @PathVariable("id")Integer id){
        logger.info("LOG getByIdPersone()   id="+id);
        Persona tmp=personaService.getPersonaById(id);
        if(tmp!=null)
            model.addAttribute("persona",tmp);
        else
            //model.addAttribute("persona",new Persona());
        throw new PersonaNotFoundException("Persona NOT FOUND");
        return "persona.html";
    }

    @GetMapping
    public String getPersone(Model model){
        System.out.println("LOG getPersona()");
        model.addAttribute("persone",personaService.getPersone());
        return "persone.html";
    }
}//end class
