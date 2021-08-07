package code.com.desafio.model.domain;

public class Flix {

    private String nome;
    private String genero;
    private String diretor;
    private String elenco;
    private int anoEstreia;
    private String sinopse;
    private float valor;
    private boolean brasileiro;

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

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public int getAnoEstreia() {
        return anoEstreia;
    }

    public void setAnoEstreia(int anoEstreia) {
        this.anoEstreia = anoEstreia;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isBrasileiro() {
        return brasileiro;
    }

    public void setBrasileiro(boolean brasileiro) {
        this.brasileiro = brasileiro;
    }

    @Override
    public String toString() {
        return "Flix{" +
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
