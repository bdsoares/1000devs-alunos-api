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
    AlunoRepository repository;

    public boolean insereAluno(Aluno aluno) {
        if (aluno.getCpf() == null)
            return false;

        this.repository.save(aluno);
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
        if (repository.existsById(aluno.getMatricula()))
            return repository.save(aluno);

        return null;
    }

    public boolean deletaAluno(Long matricula) {
        if (repository.existsById(matricula)) {
            repository.deleteById(matricula);
            return true;
        }

        return false;
    }
}
