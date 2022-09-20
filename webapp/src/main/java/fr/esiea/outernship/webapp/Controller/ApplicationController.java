package fr.esiea.outernship.webapp.Controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
public class ApplicationController {
    @RequestMapping("/")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("./templates/auth-signin.html");
        modelAndView.addObject("message", "./templates/auth-signin.html");
        return modelAndView;
    }
    @RequestMapping("/login")
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView("./templates/auth-signin.html");
        modelAndView.addObject("message", "./templates/auth-signin.html");
        return modelAndView;
    }


}
