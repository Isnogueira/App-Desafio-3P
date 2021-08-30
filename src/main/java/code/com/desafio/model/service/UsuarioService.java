package code.com.desafio.model.service;

import code.com.desafio.model.domain.Usuario;
import code.com.desafio.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario validar(String email, String senha){

        return usuarioRepository.autenticacao(email, senha);
    }

    public void incluir(Usuario usuario){

        usuarioRepository.save(usuario);
    }
}
