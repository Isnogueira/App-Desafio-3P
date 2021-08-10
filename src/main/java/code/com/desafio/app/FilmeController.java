package code.com.desafio.app;

import code.com.desafio.model.domain.Filme;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FilmeController {

    @GetMapping (value="/")
    public String inicializa(){
        return "index";
    }

    @GetMapping (value="/filme/cadastro")
    public String telaCadastro(){

        return "filme/cadastro";
    }

    @PostMapping(value="/filme/incluir")
    public String incluir(Model model, Filme filme) {

        model.addAttribute("mensagem", "O filme " + filme.getNome() + " cadastrado com sucesso!");

        return obterLista(model);
    }

    @GetMapping(value="/filme/excluir")
    public String excluir(Model model){

        model.addAttribute("mensagem", "Filme excluído com sucesso!");

        return obterLista(model);
    }

    @GetMapping(value="/filme/consultar")
    public String cousultar(){

        return "filme/consultar";
    }

    @GetMapping(value="/filme/lista")
    public String obterLista(Model model){

        List<Filme> colecaoFilmes = new ArrayList<>();
        colecaoFilmes.add(new Filme("Invocação do mal", "Terror"));
        colecaoFilmes.add(new Filme("Homem de ferro", "Ação/ficcion"));
        colecaoFilmes.add(new Filme("Doutor Estranho", "Ação/ficcion"));
        colecaoFilmes.add(new Filme("A múmia", "Aventura"));
        colecaoFilmes.add(new Filme("As patricinhas de Bervely Hills", "Romance"));

        model.addAttribute("filmes", colecaoFilmes);

        return "filme/lista";
    }
}
