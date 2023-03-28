package br.com.levi.dao;

import br.com.levi.models.Products;

import javax.persistence.EntityManager;

public class ProductDao {

    private EntityManager em;
    //utilizar a ideia de injeção de dependências

    public ProductDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Products product) {
        this.em.persist(product);
    }

    public void atualizar(Products products) {
        this.em.persist(products);
    }

    public void remover(Products products) {
        this.em.merge(products);
    }

    public Products buscarPorId(Long id) {
        return em.find(Products.class, id);

    }
}
