package fr.esiea.outernship.webapp;


import fr.esiea.outernship.webapp.Controller.ApplicationController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ApplicationController.class);
        springApplication.run(args);
    }
}
