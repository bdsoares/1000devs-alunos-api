package com.brunodaniel.alunosapi.service;

import com.brunodaniel.alunosapi.entity.Aluno;
import com.brunodaniel.alunosapi.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository repository;

    public boolean insereAluno(Aluno aluno) {
        repository.save(aluno);
        return true;
    }

    public Optional<Aluno> buscaAluno(Long matricula) {
        return repository.findById(matricula);
    }

    public Optional<Aluno> buscaAlunoCpf(String cpf) {
        return repository.findByCpf(cpf);
    }

    public List<Aluno> buscaAlunos() {
        return repository.findAll();
    }

    public Aluno atualizaAluno(Aluno aluno) {
        return repository.save(aluno);
    }

    public boolean deletaAluno(Long matricula) {
        repository.deleteById(matricula);
        return true;
    }
}
