package fr.esiea.outernship.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ApplicationController {
    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("home");
        return mv;
    }

    @RequestMapping(value = "/planification", method = RequestMethod.GET)
    public ModelAndView planification(){
        ModelAndView mv = new ModelAndView("planification");
        return mv;
    }

    @RequestMapping(value = "/brief", method = RequestMethod.GET)
    public ModelAndView brief(){
        ModelAndView mv = new ModelAndView("brief");
        return mv;
    }

    @RequestMapping(value = "/analyse", method = RequestMethod.GET)
    public ModelAndView analyse(){
        ModelAndView mv = new ModelAndView("analyse");
        return mv;
    }

    @RequestMapping(value = "/persona", method = RequestMethod.GET)
    public ModelAndView persona(){
        ModelAndView mv = new ModelAndView("persona");
        return mv;
    }

    @RequestMapping(value = "/ideation", method = RequestMethod.GET)
    public ModelAndView ideation(){
        ModelAndView mv = new ModelAndView("ideation");
        return mv;
    }

    @RequestMapping(value = "/conception", method = RequestMethod.GET)
    public ModelAndView conception(){
        ModelAndView mv = new ModelAndView("conception");
        return mv;
    }

    @RequestMapping(value = "/testUtilisateur", method = RequestMethod.GET)
    public ModelAndView testUtilisateur(){
        ModelAndView mv = new ModelAndView("testUtilisateur");
        return mv;
    }

    @RequestMapping(value = "/resultatTest", method = RequestMethod.GET)
    public ModelAndView resultatTest(){
        ModelAndView mv = new ModelAndView("resultatTest");
        return mv;
    }

    @RequestMapping(value = "/maquette",method = RequestMethod.GET)
    public ModelAndView maquette(){
        ModelAndView mv = new ModelAndView("maquette");
        return mv;
    }

    @RequestMapping(value = "/soutenance", method = RequestMethod.GET)
    public ModelAndView soutenance(){
        ModelAndView mv = new ModelAndView("soutenance");
        return mv;
    }

}
