/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.FlightSchedule;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface FlightScheduleFacadeLocal {

    void create(FlightSchedule flightSchedule);

    void edit(FlightSchedule flightSchedule);

    void remove(FlightSchedule flightSchedule);

    FlightSchedule find(Object id);

    List<FlightSchedule> findAll();

    List<FlightSchedule> findRange(int[] range);

    int count();
    
}
