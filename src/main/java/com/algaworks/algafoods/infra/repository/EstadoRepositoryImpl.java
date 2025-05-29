package com.algaworks.algafoods.infra.repository;

import com.algaworks.algafoods.domain.model.Estado;
import com.algaworks.algafoods.domain.model.Estado;
import com.algaworks.algafoods.domain.repository.EstadoRepository;
import com.algaworks.algafoods.domain.repository.EstadoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class EstadoRepositoryImpl implements EstadoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Estado> listar() {
        TypedQuery<Estado> query = entityManager.createQuery("from Estado", Estado.class);
        return query.getResultList();
    }

    @Override
    @Transactional
    public Estado buscarId(Long id) {
        return entityManager.find(Estado.class, id);
    }

    @Override
    @Transactional
    public Estado salvar(Estado estado) {
        return entityManager.merge(estado);
    }

    @Override
    @Transactional
    public void remover(Estado estado) {
        entityManager.remove(estado);
    }
}
