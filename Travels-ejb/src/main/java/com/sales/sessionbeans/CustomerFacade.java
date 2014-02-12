/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Customer;
import java.math.BigDecimal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author steve
 */
@Stateless
public class CustomerFacade extends AbstractFacade<Customer> implements CustomerFacadeLocal {
    @PersistenceContext(unitName = "com.sales_Travels-ejb_ejb_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomerFacade() {
        super(Customer.class);
    }
    
    @Override
    public void create(Customer customer){
        em.persist(customer);
    }
    @Override
    public void remove(Customer customer){
        em.remove(em.merge(customer));
       
    }
    public void edit(Customer customer){
        em.merge(customer);
    }

    @Override
    public BigDecimal findIDByEmail(String s) {
        Query query=em.createNamedQuery("Customer.findByEmail");
        query.setParameter("email", s);
        Customer resul=(Customer)query.getSingleResult();
        return resul.getIdpass();
        
    }

   @Override
    public Customer findAllDataByEmail(String s) {
        Query qw=em.createNamedQuery("Customer.findByEmail");
        qw.setParameter("email", s);
       Customer  singleResult = (Customer)qw.getSingleResult();
       return  singleResult;
    }

    @Override
    public Customer findbyID(BigDecimal idpass){
        return em.find(Customer.class, idpass);
    }
    
}
