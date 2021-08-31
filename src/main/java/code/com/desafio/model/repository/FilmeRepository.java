package code.com.desafio.model.repository;

import code.com.desafio.model.domain.Filme;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FilmeRepository extends CrudRepository<Filme, Integer> {

    List<Filme> findAll(Sort sort);
}
