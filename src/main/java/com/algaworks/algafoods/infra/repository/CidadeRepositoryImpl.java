package com.algaworks.algafoods.infra.repository;

import com.algaworks.algafoods.domain.model.Cidade;
import com.algaworks.algafoods.domain.repository.CidadeRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class CidadeRepositoryImpl implements CidadeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Cidade> listar() {
        TypedQuery<Cidade> query = entityManager.createQuery("from Cidade", Cidade.class);
        return query.getResultList();
    }

    @Override
    @Transactional
    public Cidade buscarId(Long id) {
        return entityManager.find(Cidade.class, id);
    }

    @Override
    @Transactional
    public Cidade salvar(Cidade cidade) {
        return entityManager.merge(cidade);
    }

    @Override
    @Transactional
    public void remover(Cidade cidade) {
        entityManager.remove(cidade);
    }
}
