package com.brunodaniel.alunosapi.controller;

import com.brunodaniel.alunosapi.entity.Peca;
import com.brunodaniel.alunosapi.service.PecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/peca")
public class PecaController {
    @Autowired
    private PecaService service;

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public boolean inserePeca(@RequestBody Peca peca){
        return service.inserePeca(peca);
    }

    @GetMapping(path = "/{id}")
    public Peca buscaPeca(@PathVariable Long id) {
        Optional<Peca> peca = service.buscaPeca(id);

        if (peca.isEmpty())
            return null;

        return peca.get();
    }

    @GetMapping(path = "/cod/{codigoBarras}")
    public Peca buscaPecaCodBarras(@PathVariable String codigoBarras) {
        Optional<Peca> peca = service.buscaPecaCodBarras(codigoBarras);

        if (peca.isEmpty())
            return null;

        return peca.get();
    }

    @GetMapping()
    public List<Peca> buscaPecas() {
        return service.buscaPecas();
    }

    @PutMapping("/{id}")
    public Peca atualizaPeca(@RequestBody Peca peca) {
        if (buscaPeca(peca.getId()) == null)
            return null;

        return service.atualizaPeca(peca);
    }

    @DeleteMapping("/{id}")
    public boolean deletaPeca(@PathVariable Long id) {
        if (buscaPeca(id) == null)
            return false;

        return service.deletaPeca(id);
    }
}
