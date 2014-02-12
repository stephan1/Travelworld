/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Propertyamenitilist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface PropertyamenitilistFacadeLocal {

    void create(Propertyamenitilist propertyamenitilist);

    void edit(Propertyamenitilist propertyamenitilist);

    void remove(Propertyamenitilist propertyamenitilist);

    Propertyamenitilist find(Object id);

    List<Propertyamenitilist> findAll();

    List<Propertyamenitilist> findRange(int[] range);

    int count();
    
}
