package com.algaworks.algafoods.domain.repository;

import com.algaworks.algafoods.domain.model.Cidade;

import java.util.List;

public interface CidadeRepository {

    List<Cidade> listar();

    Cidade buscarId(Long id);

    Cidade salvar(Cidade cidade);

    void remover(Cidade cidade);
}
