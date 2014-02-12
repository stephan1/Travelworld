/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Statess;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface StatessFacadeLocal {

    void create(Statess statess);

    void edit(Statess statess);

    void remove(Statess statess);

    Statess find(Object id);

    List<Statess> findAll();

    List<Statess> findRange(int[] range);

    int count();
    
}
