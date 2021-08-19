package code.com.desafio.model.domain;

import javax.persistence.*;

@Entity
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String genero;
    private String diretor;
    private String elenco;
    private int anoEstreia;
    @Column(name="sinopse", nullable=false, length=2000)
    private String sinopse;
    private float valor;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public void setAnoEstreia(int anoEstreia) {
        this.anoEstreia = anoEstreia;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setBrasileiro(String brasileiro) {

        this.brasileiro = brasileiro;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", diretor='" + diretor + '\'' +
                ", elenco='" + elenco + '\'' +
                ", anoEstreia=" + anoEstreia +
                ", sinopse='" + sinopse + '\'' +
                ", valor=" + valor +
                ", brasileiro='" + brasileiro + '\'' +
                '}';
    }
}
