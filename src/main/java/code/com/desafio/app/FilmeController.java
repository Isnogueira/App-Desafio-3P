package code.com.desafio.app;

import code.com.desafio.service.FilmeService;
import code.com.desafio.domain.model.Filme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;


@Controller
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

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

      filmeService.incluir(filme);

        model.addAttribute("mensagem",   filme.getNome() + " cadastrado com sucesso!");

        return obterLista(model);
    }

    @GetMapping(value="/filme/{id}/excluir")
    public String excluir(Model model, @PathVariable Integer id){

        Optional<Filme> filmeExcluido = filmeService.obterPorId(id);

        String msg = "Não foi possível realizar a exclusão.";

        if(filmeExcluido.isPresent()){
            filmeService.excluir(id);
            Filme filme = filmeExcluido.get();
            msg = filme.getNome() + " foi excluído com sucesso!";
        }

        model.addAttribute("mensagem",  msg);

        return obterLista(model);
    }

    @GetMapping(value="/filme/consultar")
    public String cousultar(){

        return "filme/consultar";
    }

    @GetMapping(value="/filme/lista")
    public String obterLista(Model model){

        model.addAttribute("filmes", filmeService.obterLista());

        return "filme/lista";
    }
}
