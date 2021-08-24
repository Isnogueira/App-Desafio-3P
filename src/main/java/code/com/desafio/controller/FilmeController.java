package code.com.desafio.controller;

import code.com.desafio.model.service.FilmeService;
import code.com.desafio.model.domain.Filme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;


@Controller
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @GetMapping (value="/index")
    public String inicializa(){
        return "index";
    }


    @GetMapping (value="/filme/cadastro")
    public String telaCadastro(){

        return "/filme/cadastro";
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

    @GetMapping(value="/filme/{id}/consultar")
    public String consultar(Model model, @PathVariable Integer id){

        Optional<Filme> filme = filmeService.obterPorId(id);

        model.addAttribute("meuFilme", filme);

        return telaCadastro();
    }

    @GetMapping(value="/filme/lista")
    public String obterLista(Model model){

        model.addAttribute("filmes", filmeService.obterLista("nome"));

        return "/filme/lista";
    }

    @GetMapping(value = "/voltar")
    public String voltar(){
        return "redirect:/filme/lista";
    }


    @PostMapping(value = "time/ordenar")
    public String ordenar(Model model, @RequestParam String sortBy){

        model.addAttribute("filmes", filmeService.obterLista(sortBy));

        return "/filme/lista";
    }
}


