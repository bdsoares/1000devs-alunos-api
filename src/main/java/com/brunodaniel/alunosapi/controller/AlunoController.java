package com.brunodaniel.alunosapi.controller;

import com.brunodaniel.alunosapi.entity.Aluno;
import com.brunodaniel.alunosapi.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/aluno")
public class AlunoController {
    @Autowired
    private AlunoService service;

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public boolean insereAluno(@RequestBody Aluno aluno) {
        if (aluno.getCpf() == null)
            return false;

        return this.service.insereAluno(aluno);
    }

    @GetMapping(path = "/{matricula}")
    public Aluno buscaAluno(@PathVariable Long matricula) {
        Optional<Aluno> aluno = this.service.buscaAluno(matricula);

        if (aluno.isEmpty())
            return null;

        return aluno.get();
    }

    @GetMapping(path = "/cpf/{cpf}")
    public Aluno buscaAlinoCpf(@PathVariable String cpf) {
        Optional<Aluno> aluno = this.service.buscaAlunoCpf(cpf);

        if (aluno.isEmpty())
            return null;

        return aluno.get();
    }

    @GetMapping()
    public List<Aluno> buscaAlunos() {
        return this.service.buscaAlunos();
    }

    @PutMapping(path = "/{matricula}")
    public Aluno atualizaAluno(@RequestBody Aluno aluno) {
        if (buscaAluno(aluno.getMatricula()) == null)
            return null;

        return this.service.atualizaAluno(aluno);
    }

    @DeleteMapping(path = "/{matricula}")
    public boolean deletaAluno(@PathVariable Long matricula) {
        if (buscaAluno(matricula) == null)
            return false;

        return this.service.deletaAluno(matricula);
    }
}
