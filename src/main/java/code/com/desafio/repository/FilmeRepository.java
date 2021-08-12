package code.com.desafio.repository;

import code.com.desafio.domain.model.Filme;
import org.springframework.data.repository.CrudRepository;

public interface FilmeRepository extends CrudRepository<Filme, Integer> {


}
