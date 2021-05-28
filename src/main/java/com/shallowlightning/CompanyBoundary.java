package com.shallowlightning;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CompanyBoundary {
    @PersistenceContext
    private EntityManager em;

    public Company findCompany(Long id){return em.find(Company.class, id);}
}
