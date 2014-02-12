/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Recreationdescriplist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface RecreationdescriplistFacadeLocal {

    void create(Recreationdescriplist recreationdescriplist);

    void edit(Recreationdescriplist recreationdescriplist);

    void remove(Recreationdescriplist recreationdescriplist);

    Recreationdescriplist find(Object id);

    List<Recreationdescriplist> findAll();

    List<Recreationdescriplist> findRange(int[] range);

    int count();
    
}
