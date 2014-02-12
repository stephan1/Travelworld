/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Aliasregionlist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface AliasregionlistFacadeLocal {

    void create(Aliasregionlist aliasregionlist);

    void edit(Aliasregionlist aliasregionlist);

    void remove(Aliasregionlist aliasregionlist);

    Aliasregionlist find(Object id);

    List<Aliasregionlist> findAll();

    List<Aliasregionlist> findRange(int[] range);

    int count();
    
}
