package code.com.desafio.service;

import code.com.desafio.domain.model.Filme;
import code.com.desafio.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {

    @Autowired
    FilmeRepository filmeRepository;

    public List<Filme> obterLista() {

        return (List<Filme>) filmeRepository.findAll();
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
