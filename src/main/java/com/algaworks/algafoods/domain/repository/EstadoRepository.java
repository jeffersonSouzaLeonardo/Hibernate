package com.algaworks.algafoods.domain.repository;

import com.algaworks.algafoods.domain.model.Estado;
import com.algaworks.algafoods.domain.model.Estado;

import java.util.List;

public interface EstadoRepository {

    List<Estado> listar();

    Estado buscarId(Long id);

    Estado salvar(Estado Estado);

    void remover(Estado Estado);
}
