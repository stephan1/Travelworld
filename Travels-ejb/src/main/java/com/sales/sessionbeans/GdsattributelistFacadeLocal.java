/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Gdsattributelist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface GdsattributelistFacadeLocal {

    void create(Gdsattributelist gdsattributelist);

    void edit(Gdsattributelist gdsattributelist);

    void remove(Gdsattributelist gdsattributelist);

    Gdsattributelist find(Object id);

    List<Gdsattributelist> findAll();

    List<Gdsattributelist> findRange(int[] range);

    int count();
    
}
