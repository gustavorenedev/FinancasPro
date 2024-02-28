package br.com.fiap.financaspro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller //@controller indica que é um controlador da aplicação
public class FinancasproApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancasproApplication.class, args);
	}

	@RequestMapping
	@ResponseBody // retorna a resposta no corpo
	public String home(){
		return "Finanças Pro";
	}
}
