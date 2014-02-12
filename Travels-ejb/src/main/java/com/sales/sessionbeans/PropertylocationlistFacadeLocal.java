/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Propertylocationlist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface PropertylocationlistFacadeLocal {

    void create(Propertylocationlist propertylocationlist);

    void edit(Propertylocationlist propertylocationlist);

    void remove(Propertylocationlist propertylocationlist);

    Propertylocationlist find(Object id);

    List<Propertylocationlist> findAll();

    List<Propertylocationlist> findRange(int[] range);

    int count();
    
}
