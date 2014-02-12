/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Branches;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface BranchesFacadeLocal {

    void create(Branches branches);

    void edit(Branches branches);

    void remove(Branches branches);

    Branches find(Object id);

    List<Branches> findAll();

    List<Branches> findRange(int[] range);

    int count();
    
}
