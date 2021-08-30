package code.com.desafio.controller;

import code.com.desafio.model.domain.Usuario;
import code.com.desafio.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/usuario")
    public String telaCadastro(){

        return "/registro";
    }

    @PostMapping(value = "/usuario")
    public String incluir(Model model, Usuario usuario){

        usuarioService.incluir(usuario);

        model.addAttribute("user", usuario);

        return "/filme/lista";

    }


}
