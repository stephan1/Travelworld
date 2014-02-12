/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Chainlist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface ChainlistFacadeLocal {

    void create(Chainlist chainlist);

    void edit(Chainlist chainlist);

    void remove(Chainlist chainlist);

    Chainlist find(Object id);

    List<Chainlist> findAll();

    List<Chainlist> findRange(int[] range);

    int count();
    
}
