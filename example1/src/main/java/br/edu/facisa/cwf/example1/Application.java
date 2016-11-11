package br.edu.facisa.cwf.example1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
@RequestMapping(value = "/recurso")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
    @RequestMapping(value = "/teste", method = RequestMethod.GET)
    @ResponseBody
    public String home() {
        return "Vai Brasil!";
    }

}
