package code.com.desafio.model.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@ToString
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Integer id;
    @Getter @Setter
    private String nome;
    @Getter @Setter
    private String genero;
    @Getter @Setter
    private String diretor;
    @Getter @Setter
    private String elenco;
    @Getter @Setter
    private int anoEstreia;
    @Getter @Setter
    @Column(name="sinopse", nullable=false, length=2000)
    private String sinopse;
    @Getter @Setter
    private float valor;
    @Getter @Setter
    private String brasileiro;

    public Filme() {
        this.diretor = "Não informado";
        this.elenco = "Não informado";
        this.anoEstreia = 0;
        this.sinopse = "Não informada";
        this.valor = 0;
        this.brasileiro = "Não informado";
    }

    public Filme(String nome, String genero) {

        super();
        this.nome = nome;
        this.genero = genero;
    }

}
