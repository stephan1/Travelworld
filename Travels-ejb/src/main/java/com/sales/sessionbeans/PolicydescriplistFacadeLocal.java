/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Policydescriplist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface PolicydescriplistFacadeLocal {

    void create(Policydescriplist policydescriplist);

    void edit(Policydescriplist policydescriplist);

    void remove(Policydescriplist policydescriplist);

    Policydescriplist find(Object id);

    List<Policydescriplist> findAll();

    List<Policydescriplist> findRange(int[] range);

    int count();
    
}
