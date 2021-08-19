package code.com.desafio.model.service;

import code.com.desafio.model.domain.Filme;
import code.com.desafio.model.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {

    @Autowired
    FilmeRepository filmeRepository;

    public List<Filme> obterLista(String campo) {

        return (List<Filme>) filmeRepository.findAll(Sort.by(Sort.Direction.ASC,campo));
    }

    public List<Filme> obterLista() {

        return (List<Filme>) filmeRepository.findAll(Sort.by(Sort.Direction.ASC,"nome"));
    }

    public void incluir(Filme filme) {

        filmeRepository.save(filme);
    }

    public void excluir(Integer id) {

        filmeRepository.deleteById(id);
    }

    public Optional<Filme> obterPorId(Integer id) {

        return filmeRepository.findById(id);
    }
}
