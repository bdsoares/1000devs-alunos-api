package com.brunodaniel.alunosapi.service;

import com.brunodaniel.alunosapi.entity.Peca;
import com.brunodaniel.alunosapi.repository.PecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PecaService {
    @Autowired
    private PecaRepository repository;

    public boolean inserePeca(Peca peca) {
        if (peca.getCodigoBarras() == null)
            return false;

        this.repository.save(peca);
        return true;
    }

    public Optional<Peca> buscaPeca(Long id) {
        return this.repository.findById(id);
    }

    public Optional<Peca> buscaPecaCodBarras(String codigoBarras) {
        return this.repository.findByCodigoBarras(codigoBarras);
    }

    public List<Peca> buscaPecas() {
        return this.repository.findAll();
    }

    public Peca atualizaPeca(Peca peca) {
        return this.repository.save(peca);
    }

    public boolean deletaPeca(Long id) {
        this.repository.deleteById(id);
        return true;
    }
}
