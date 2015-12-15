package com.verdicchio.repository;


import com.verdicchio.model.House;
import com.verdicchio.model.Product;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.List;

/**
 * Created by verdian on 19/08/2015.
 */
@TransactionManagement(TransactionManagementType.CONTAINER)
public class ConsultationRepository {

    public ConsultationRepository() {
    }

    @Inject
    private EntityManager em;


    //// TODO: remove, it is only to try to retrive an house
    public House findHouseById(long id)
    {
        return em.find(House.class, id);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public long saveProduct(Product product) throws Exception {
        em.persist(product);
        em.flush();
        return product.getId();
    }


    //// TODO: remove, it is only to try to retrive an product
    //todo : check if get the house or the product for take the house design
    public List<Product> getHouseDesign()
    {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Product> criteria = cb.createQuery(Product.class);

        Root<Product> productRoot = criteria.from(Product.class);

        // Swap criteria statements if you would like to try out type-safe criteria queries, a new
        // feature in JPA 2.0
        // criteria.select(customer).orderBy(cb.asc(customer.get(Customer_.name)));
        criteria.select(productRoot).where(cb.equal(productRoot.get("isBasicDesign"), true));
        return em.createQuery(criteria).getResultList();
    }

}
