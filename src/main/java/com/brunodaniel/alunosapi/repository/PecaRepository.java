package com.brunodaniel.alunosapi.repository;

import com.brunodaniel.alunosapi.entity.Peca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PecaRepository extends JpaRepository<Peca, Long> {
    Optional<Peca> findByCodigoBarras(String codigoBarras);
}
