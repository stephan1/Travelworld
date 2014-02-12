/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Neighborhoodcoordinateslist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface NeighborhoodcoordinateslistFacadeLocal {

    void create(Neighborhoodcoordinateslist neighborhoodcoordinateslist);

    void edit(Neighborhoodcoordinateslist neighborhoodcoordinateslist);

    void remove(Neighborhoodcoordinateslist neighborhoodcoordinateslist);

    Neighborhoodcoordinateslist find(Object id);

    List<Neighborhoodcoordinateslist> findAll();

    List<Neighborhoodcoordinateslist> findRange(int[] range);

    int count();
    
}
