package com.algaworks.algafoods.infra.repository;

import com.algaworks.algafoods.domain.model.FormaPagamento;
import com.algaworks.algafoods.domain.repository.FormaPagamentoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class FormaPagamentoRepositoryImp implements FormaPagamentoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<FormaPagamento> listar() {
        TypedQuery<FormaPagamento> query =  entityManager.createQuery("from FormaPagamento", FormaPagamento.class);
        return query.getResultList();
    }

    @Override
    public FormaPagamento buscar(Long id) {
        return entityManager.find(FormaPagamento.class, id);
    }

    @Override
    @Transactional
    public FormaPagamento salvar(FormaPagamento formaPagamento) {
        return entityManager.merge(formaPagamento);
    }

    @Override
    @Transactional
    public void remover(FormaPagamento formaPagamento) {
        entityManager.remove(formaPagamento);
    }
}
