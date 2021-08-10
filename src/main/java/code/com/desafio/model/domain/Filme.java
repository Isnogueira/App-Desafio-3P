package code.com.desafio.model.domain;

public class Filme {

    private String nome;
    private String genero;
    private String diretor;
    private String elenco;
    private int anoEstreia;
    private String sinopse;
    private float valor;
    private boolean brasileiro;

    public Filme(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
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

    public void setBrasileiro(boolean brasileiro) {
        this.brasileiro = brasileiro;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "\nnome='" + nome + "," +
                "\ngenero='" + genero + "," +
                "\ndiretor='" + diretor + "," +
                "\nelenco='" + elenco + "," +
                "\nanoEstreia=" + anoEstreia + "," +
                "\nsinopse='" + sinopse + "," +
                "\nvalor=" + valor + "," +
                "\nbrasileiro=" + brasileiro + "\n" +
                '}';
    }
}
