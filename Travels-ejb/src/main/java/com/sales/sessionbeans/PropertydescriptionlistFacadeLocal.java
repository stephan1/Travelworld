/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Propertydescriptionlist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface PropertydescriptionlistFacadeLocal {

    void create(Propertydescriptionlist propertydescriptionlist);

    void edit(Propertydescriptionlist propertydescriptionlist);

    void remove(Propertydescriptionlist propertydescriptionlist);

    Propertydescriptionlist find(Object id);

    List<Propertydescriptionlist> findAll();

    List<Propertydescriptionlist> findRange(int[] range);

    int count();
    
}
