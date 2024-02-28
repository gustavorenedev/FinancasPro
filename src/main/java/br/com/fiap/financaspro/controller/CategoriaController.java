package br.com.fiap.financaspro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CategoriaController {

    @RequestMapping(method = RequestMethod.GET, path = "/categoria", produces = "application/json") 
    //somente o método get ira funcionar e o path para ser /categoria, e a saida vai ser um json
    @ResponseBody
    public String index() {
        return """
                string de múltiplas linhas três aspas
                [
                    {
                        "id": 1,
                        "nome": "Alimentação",
                        "icone": "Fast-food"
                    },
                    {
                        "id": 2,
                        "nome": "Educação",
                        "icone": "Book"
                    },
                ]
                    """;
    }

}
