/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Propertyrenovationslist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface PropertyrenovationslistFacadeLocal {

    void create(Propertyrenovationslist propertyrenovationslist);

    void edit(Propertyrenovationslist propertyrenovationslist);

    void remove(Propertyrenovationslist propertyrenovationslist);

    Propertyrenovationslist find(Object id);

    List<Propertyrenovationslist> findAll();

    List<Propertyrenovationslist> findRange(int[] range);

    int count();
    
}
