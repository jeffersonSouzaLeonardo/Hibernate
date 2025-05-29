package com.algaworks.algafoods.infra.repository;

import com.algaworks.algafoods.domain.model.Permissao;
import com.algaworks.algafoods.domain.repository.PemissaoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class PemissaoRepositoryImpl implements PemissaoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Permissao> listar() {
        TypedQuery<Permissao> query = entityManager.createQuery("from Permissao", Permissao.class);
        return query.getResultList();
    }

    @Override
    public Permissao buscar(Long id) {
        return entityManager.find(Permissao.class, id);
    }

    @Override
    @Transactional
    public Permissao salvar(Permissao permissao) {
        return entityManager.merge(permissao);
    }

    @Override
    @Transactional
    public void remover(Permissao permissao) {
        entityManager.remove(permissao);

    }
}
