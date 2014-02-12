/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Propertytypelist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface PropertytypelistFacadeLocal {

    void create(Propertytypelist propertytypelist);

    void edit(Propertytypelist propertytypelist);

    void remove(Propertytypelist propertytypelist);

    Propertytypelist find(Object id);

    List<Propertytypelist> findAll();

    List<Propertytypelist> findRange(int[] range);

    int count();
    
}
