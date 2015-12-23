package com.verdicchio.repository;


import com.verdicchio.model.House;
import com.verdicchio.model.HouseStyleEnum;
import com.verdicchio.model.Product;

import javax.ejb.*;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

/**
 * Created by verdian on 19/08/2015.
 */
@Stateless
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

    public long saveProduct(Product product) throws Exception {
        em.persist(product);
        em.flush();
        return product.getId();
    }


    //// TODO: remove, it is only to try to retrive an product
    //todo : check if get the house or the product for take the house design
    public List<HouseStyleEnum> getHouseStyles()
    {
        return new ArrayList<HouseStyleEnum>(EnumSet.allOf(HouseStyleEnum.class));

    }


    public List<Product> getHouseByStyle(HouseStyleEnum houseStyleEnum)
    {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Product> criteria = cb.createQuery(Product.class);
        Root<Product> productRoot = criteria.from(Product.class);
        Join<House, Product> productJoin = productRoot.join("house");


        criteria.select(productRoot).where(cb.equal(productJoin.get("houseStyle"), houseStyleEnum));
        return em.createQuery(criteria).getResultList();
    }

}
