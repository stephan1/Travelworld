/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Properbusinesamenitilist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface ProperbusinesamenitilistFacadeLocal {

    void create(Properbusinesamenitilist properbusinesamenitilist);

    void edit(Properbusinesamenitilist properbusinesamenitilist);

    void remove(Properbusinesamenitilist properbusinesamenitilist);

    Properbusinesamenitilist find(Object id);

    List<Properbusinesamenitilist> findAll();

    List<Properbusinesamenitilist> findRange(int[] range);

    int count();
    
}
