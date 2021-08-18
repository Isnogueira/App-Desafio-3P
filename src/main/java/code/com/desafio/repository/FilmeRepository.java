package code.com.desafio.repository;

import code.com.desafio.domain.model.Filme;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FilmeRepository extends CrudRepository<Filme, Integer> {

    public List<Filme> findAll(Sort sort);
}
