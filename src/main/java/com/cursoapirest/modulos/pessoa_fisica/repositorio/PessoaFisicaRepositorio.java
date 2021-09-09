package com.cursoapirest.modulos.pessoa_fisica.repositorio;

import com.cursoapirest.modulos.pessoa_fisica.model.PessoaFisica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaFisicaRepositorio extends JpaRepository<PessoaFisica, Long> {
}
