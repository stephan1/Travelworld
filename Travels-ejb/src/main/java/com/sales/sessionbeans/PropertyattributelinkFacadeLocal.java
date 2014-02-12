/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Propertyattributelink;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface PropertyattributelinkFacadeLocal {

    void create(Propertyattributelink propertyattributelink);

    void edit(Propertyattributelink propertyattributelink);

    void remove(Propertyattributelink propertyattributelink);

    Propertyattributelink find(Object id);

    List<Propertyattributelink> findAll();

    List<Propertyattributelink> findRange(int[] range);

    int count();
    
}
