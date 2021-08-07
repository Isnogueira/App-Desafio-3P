package code.com.desafio.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FlixController {

    @GetMapping (value="/")
    public String inicializa(){
        return "index";

    }

    @GetMapping(value="/filmes/lista")
    public String obterLista(Model model){

        List<String> colecaoFilmes = new ArrayList<>();
        colecaoFilmes.add("Os vingadores");
        colecaoFilmes.add("Homem de ferro");
        colecaoFilmes.add("Doutor Estranho");
        colecaoFilmes.add("A múmia");
        colecaoFilmes.add("As patricinhas de Bervely hils");

        model.addAttribute("filmes", colecaoFilmes);

        return "filmes/lista";
    }
}
