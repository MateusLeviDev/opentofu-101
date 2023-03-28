package br.com.levi.testes;

import br.com.levi.dao.CategoriaDao;
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

        Categoria celulares = new Categoria("CELULARES");


        Products celular = new Products("iphone 13", "Muito caro.", new BigDecimal("800"), celulares);

        EntityManager em = JPAUtil.getEntityManager();
        ProductDao productDao = new ProductDao(em);
        CategoriaDao categoriaDao = new CategoriaDao(em);

        em.getTransaction().begin();

        categoriaDao.cadastrar(celulares);
        productDao.cadastrar(celular);

        em.getTransaction().commit();
        em.close();
    }
}
