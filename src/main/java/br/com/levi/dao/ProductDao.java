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
}
