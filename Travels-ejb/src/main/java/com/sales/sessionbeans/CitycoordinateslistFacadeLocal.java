/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Citycoordinateslist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface CitycoordinateslistFacadeLocal {

    void create(Citycoordinateslist citycoordinateslist);

    void edit(Citycoordinateslist citycoordinateslist);

    void remove(Citycoordinateslist citycoordinateslist);

    Citycoordinateslist find(Object id);

    List<Citycoordinateslist> findAll();

    List<Citycoordinateslist> findRange(int[] range);

    int count();
    
}
