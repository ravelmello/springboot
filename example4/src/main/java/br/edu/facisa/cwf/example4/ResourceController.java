package br.edu.facisa.cwf.example4;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

	@RequestMapping(value="/app/usuario/{nome}", method = RequestMethod.GET)
	public String olaMundoPersonalizado(@PathVariable(value="nome") String nome) {
		return "Nome inserido " + nome;
	}

	@RequestMapping(value="/v2", method = RequestMethod.GET)
	public String olaMundoPersonalizadoV2(
		@RequestParam(value="nome",defaultValue="nome padrão") String nome, 
		@RequestParam(value="sobrenome",defaultValue="sobrenome padrão") String sobrenm) {
		
		return "Olá " + nome + " " + sobrenm;
	}
}
