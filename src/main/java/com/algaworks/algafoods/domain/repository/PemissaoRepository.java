package com.algaworks.algafoods.domain.repository;

import com.algaworks.algafoods.domain.model.Permissao;

import java.util.List;

public interface PemissaoRepository {

    List<Permissao> listar();

    Permissao buscar(Long id);

    Permissao salvar(Permissao permissao);

    void remover(Permissao permissao);

}
