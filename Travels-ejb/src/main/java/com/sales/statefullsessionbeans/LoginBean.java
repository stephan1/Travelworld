/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.statefullsessionbeans;


import com.sales.entities.Customer;
import com.sales.sessionbeans.CustomerFacadeLocal;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author steve
 */
@Stateful
public class LoginBean implements LoginBeanLocal {
   @EJB
    private Customer customer ;
   @PersistenceContext(unitName = "com.sales_Travels-ejb_ejb_1.0PU")
    private EntityManager em;
   @EJB private CustomerFacadeLocal custofacade;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public boolean findbyloginPwd(String login, String password) {
        Query  q=em.createNamedQuery("select u from Customer u where u.email=?1 and password=?2");
        q.setParameter(1,login);
        q.setParameter(2, password);
        int nombre=q.getResultList().size();
        if(nombre==1){
            return true;
        }else{
            return false;
        }
       
    }

    @Override
    public Customer findDataUser(String login,String password) {
        if(findbyloginPwd( login, password)==true){
            return custofacade.findAllDataByEmail(login);
        }else {
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
