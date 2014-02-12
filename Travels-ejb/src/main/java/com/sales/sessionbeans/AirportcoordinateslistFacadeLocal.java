/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Airportcoordinateslist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface AirportcoordinateslistFacadeLocal {

    void create(Airportcoordinateslist airportcoordinateslist);

    void edit(Airportcoordinateslist airportcoordinateslist);

    void remove(Airportcoordinateslist airportcoordinateslist);

    Airportcoordinateslist find(Object id);

    List<Airportcoordinateslist> findAll();

    List<Airportcoordinateslist> findRange(int[] range);

    int count();
    
}
