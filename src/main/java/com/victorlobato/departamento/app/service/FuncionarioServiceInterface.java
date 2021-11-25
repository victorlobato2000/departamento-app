package com.victorlobato.departamento.app.service;

import com.victorlobato.departamento.app.domain.Funcionario;

import java.util.List;
import java.util.Optional;

public interface FuncionarioServiceInterface {

    Funcionario create(Funcionario funcionario);
    Optional<Funcionario> findById(Long id);
    List<Funcionario> findAll(Funcionario funcionario);
    void deleteById(Long id);
    Funcionario update(Long id, Funcionario funcionario_novo);
}
