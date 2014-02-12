/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Payements;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface PayementsFacadeLocal {

    void create(Payements payements);

    void edit(Payements payements);

    void remove(Payements payements);

    Payements find(Object id);

    List<Payements> findAll();

    List<Payements> findRange(int[] range);

    int count();
    
}
