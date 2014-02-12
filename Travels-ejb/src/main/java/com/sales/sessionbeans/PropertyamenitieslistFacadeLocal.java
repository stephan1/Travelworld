/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Propertyamenitieslist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface PropertyamenitieslistFacadeLocal {

    void create(Propertyamenitieslist propertyamenitieslist);

    void edit(Propertyamenitieslist propertyamenitieslist);

    void remove(Propertyamenitieslist propertyamenitieslist);

    Propertyamenitieslist find(Object id);

    List<Propertyamenitieslist> findAll();

    List<Propertyamenitieslist> findRange(int[] range);

    int count();
    
}
