/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Propertymandatoryfeeslist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface PropertymandatoryfeeslistFacadeLocal {

    void create(Propertymandatoryfeeslist propertymandatoryfeeslist);

    void edit(Propertymandatoryfeeslist propertymandatoryfeeslist);

    void remove(Propertymandatoryfeeslist propertymandatoryfeeslist);

    Propertymandatoryfeeslist find(Object id);

    List<Propertymandatoryfeeslist> findAll();

    List<Propertymandatoryfeeslist> findRange(int[] range);

    int count();
    
}
