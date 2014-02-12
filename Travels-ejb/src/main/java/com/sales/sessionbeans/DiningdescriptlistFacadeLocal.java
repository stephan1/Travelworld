/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Diningdescriptlist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface DiningdescriptlistFacadeLocal {

    void create(Diningdescriptlist diningdescriptlist);

    void edit(Diningdescriptlist diningdescriptlist);

    void remove(Diningdescriptlist diningdescriptlist);

    Diningdescriptlist find(Object id);

    List<Diningdescriptlist> findAll();

    List<Diningdescriptlist> findRange(int[] range);

    int count();
    
}
