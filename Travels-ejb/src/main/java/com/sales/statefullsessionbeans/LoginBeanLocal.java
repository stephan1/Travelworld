/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.statefullsessionbeans;


import com.sales.entities.Customer;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface LoginBeanLocal {
    
    public boolean findbyloginPwd(String login, String password);
    public Customer findDataUser(String login,String password);
    
}
