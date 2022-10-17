package fr.esiea.outernship.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ApplicationController {
    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String index() {
        return "home";
    }

}
