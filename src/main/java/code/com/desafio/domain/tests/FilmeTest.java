package code.com.desafio.domain.tests;

import code.com.desafio.domain.model.Filme;

public class FilmeTest {

    public static void main(String[] args) {

        Filme flix = new Filme("Star wars - Uma nova esperança", "ficção científica");
        flix.setDiretor("George lucas");
        flix.setElenco("Mark Hammil, Harrison Ford, " +
                "Carrie Fisher, Alec Guinness," +
                " Kenny Baker, Anthony Daniels," +
                " Robert Clarke, Peter Cushing," +
                " David Prowse, Peter Mayhew");
        flix.setAnoEstreia(1977);
        flix.setSinopse("O filme conta a história do jovem fazendeiro Luke Skywalker (Mark Hamill)," +
                " que após adquirir dois droids (robôs), envolve-se na Guerra Civil Galáctica" +
                " entre o tirano Império Galáctico e a Aliança Rebelde, ao lado do contrabandista " +
                "Han Solo (Harrison Ford). Um dos robôs contém em sua memória o projeto secreto " +
                "da super arma do Império, Estrela da Morte, roubado pelos rebeldes e inserido no droid " +
                "por sua líder, Princesa Léia (Carrie Fisher), que espera destruir o Império e salvar a galáxia");
        flix.setValor(20);
        flix.setBrasileiro("Não");

        System.out.println(flix);
    }
}
