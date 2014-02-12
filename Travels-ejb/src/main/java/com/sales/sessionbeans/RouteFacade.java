/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Route;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author steve
 */
@Stateless
public class RouteFacade extends AbstractFacade<Route> implements RouteFacadeLocal {
    @PersistenceContext(unitName = "com.sales_Travels-ejb_ejb_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RouteFacade() {
        super(Route.class);
    }
    
}
