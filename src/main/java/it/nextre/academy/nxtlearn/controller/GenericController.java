package it.nextre.academy.nxtlearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

@Controller
public class GenericController {
    @GetMapping({"/","/home","/index"})//rotta
    public String getHome(Model model){
        System.out.println("LOG:getHome()");
        model.addAttribute("dataora", LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss")));
        model.addAttribute("dtobj",LocalDateTime.now());
        List<Integer> numeri= Arrays.asList(15,7,6,8,52,36);
        model.addAttribute("estratti",numeri);
        return "homeV1.html";}//nome view
}//end class
