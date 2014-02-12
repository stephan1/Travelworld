/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Regioncentercoordinateslist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface RegioncentercoordinateslistFacadeLocal {

    void create(Regioncentercoordinateslist regioncentercoordinateslist);

    void edit(Regioncentercoordinateslist regioncentercoordinateslist);

    void remove(Regioncentercoordinateslist regioncentercoordinateslist);

    Regioncentercoordinateslist find(Object id);

    List<Regioncentercoordinateslist> findAll();

    List<Regioncentercoordinateslist> findRange(int[] range);

    int count();
    
}
