package com.victorlobato.departamento.app.service.impl;

import com.victorlobato.departamento.app.domain.Funcionario;
import com.victorlobato.departamento.app.service.FuncionarioServiceInterface;

import java.util.List;
import java.util.Optional;

public class FuncionarioServiceImpl implements FuncionarioServiceInterface {
    @Override
    public Funcionario create(Funcionario funcionario) {
        return null;
    }

    @Override
    public Optional<Funcionario> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Funcionario> findAll(Funcionario funcionario) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Funcionario update(Long id, Funcionario funcionario_novo) {
        return null;
    }
}
