/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Attributelist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface AttributelistFacadeLocal {

    void create(Attributelist attributelist);

    void edit(Attributelist attributelist);

    void remove(Attributelist attributelist);

    Attributelist find(Object id);

    List<Attributelist> findAll();

    List<Attributelist> findRange(int[] range);

    int count();
    
}
