/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.AirlineBooked;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface AirlineBookedFacadeLocal {

    void create(AirlineBooked airlineBooked);

    void edit(AirlineBooked airlineBooked);

    void remove(AirlineBooked airlineBooked);

    AirlineBooked find(Object id);

    List<AirlineBooked> findAll();

    List<AirlineBooked> findRange(int[] range);

    int count();
    
}
