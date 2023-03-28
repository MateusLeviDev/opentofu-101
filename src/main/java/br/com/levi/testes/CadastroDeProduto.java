package br.com.levi.testes;

import br.com.levi.dao.ProductDao;
import br.com.levi.models.Categoria;
import br.com.levi.models.Products;
import br.com.levi.util.JPAUtil;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class CadastroDeProduto {
    public static void main(String[] args) {

        Products celular = new Products("iphone 13", "Muito caro.", new BigDecimal("800"), Categoria.CELULARES);

        EntityManager em = JPAUtil.getEntityManager();
        ProductDao dao = new ProductDao(em);

        em.getTransaction().begin();
        dao.cadastrar(celular);
        em.getTransaction().commit();
        em.close();
    }
}
