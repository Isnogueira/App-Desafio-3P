package code.com.desafio.model.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Integer id;
    @Getter @Setter
    private String nome;
    @Getter @Setter
    private String email;
    @Getter @Setter
    private String senha;
    @Getter @Setter
    private Boolean admin;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}
