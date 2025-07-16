package com.algaworks.algafoods.service;

import com.algaworks.algafoods.domain.model.Cidade;
import com.algaworks.algafoods.domain.repository.CidadeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {
    private CidadeRepository cidadeRepository;

    public Cidade salvar(Cidade cidade){
        return cidadeRepository.salvar(cidade);
    }

    public Cidade editar(Cidade nova){
        Cidade cidadeAtual = cidadeRepository.buscarId(nova.getId());
        BeanUtils.copyProperties(cidadeAtual, nova);
        return cidadeRepository.salvar(cidadeAtual);
    }
    public void excluir(Cidade cidade){
         cidadeRepository.remover(cidade);
    }

    public List<Cidade> listar() {
        return cidadeRepository.listar();
    }

    public Cidade buscarId(Long id) {
        return cidadeRepository.buscarId(id);
    }
}
