/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Propertyfeeslist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface PropertyfeeslistFacadeLocal {

    void create(Propertyfeeslist propertyfeeslist);

    void edit(Propertyfeeslist propertyfeeslist);

    void remove(Propertyfeeslist propertyfeeslist);

    Propertyfeeslist find(Object id);

    List<Propertyfeeslist> findAll();

    List<Propertyfeeslist> findRange(int[] range);

    int count();
    
}
