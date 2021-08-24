package code.com.desafio.controller;

import code.com.desafio.model.domain.Usuario;
import code.com.desafio.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("user")
@Controller
public class AcessoController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/")
    public String telaLogin() {
        return "/login";
    }

    @PostMapping(value = "/login")
    public String Login(Model model, @RequestParam String email, String senha) {

        Usuario usuario = usuarioService.validar(email, senha);

        if (usuario != null) {

            model.addAttribute("user", usuario);

            return "/index";

        } else {

            model.addAttribute("mensagem", "Autenticação inválida para o usuário " + email + "!");

            return "/login";
        }


    }

}
