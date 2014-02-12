/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Parentregionlist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface ParentregionlistFacadeLocal {

    void create(Parentregionlist parentregionlist);

    void edit(Parentregionlist parentregionlist);

    void remove(Parentregionlist parentregionlist);

    Parentregionlist find(Object id);

    List<Parentregionlist> findAll();

    List<Parentregionlist> findRange(int[] range);

    int count();
    
}
