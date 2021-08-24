package code.com.desafio.model.repository;

import code.com.desafio.model.domain.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

    @Query("from Usuario u where u.email = :email and u.senha = :senha")
    public Usuario autenticacao(String email, String senha);
}
