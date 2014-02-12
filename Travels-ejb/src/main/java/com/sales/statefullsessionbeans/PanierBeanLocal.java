/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.statefullsessionbeans;


import com.sales.entities.Customer;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface PanierBeanLocal {
    public void addtoCart(BigDecimal serviceId,Object ajout);
    public void removefromCart(BigDecimal serviceId,int index);
    public void showelemofCart();
    public void makeorders();
    public double getMontantTotal();   
    public void viderPanier();
    public List ShowHistoBooking(Customer u);
}
