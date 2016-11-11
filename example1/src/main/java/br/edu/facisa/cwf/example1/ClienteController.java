package br.edu.facisa.cwf.example1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/cliente")
public class ClienteController {

    @RequestMapping
    @ResponseBody
    public String home() {
        return "Cliente 1";
    }
}
