/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Areaattractslist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface AreaattractslistFacadeLocal {

    void create(Areaattractslist areaattractslist);

    void edit(Areaattractslist areaattractslist);

    void remove(Areaattractslist areaattractslist);

    Areaattractslist find(Object id);

    List<Areaattractslist> findAll();

    List<Areaattractslist> findRange(int[] range);

    int count();
    
}
