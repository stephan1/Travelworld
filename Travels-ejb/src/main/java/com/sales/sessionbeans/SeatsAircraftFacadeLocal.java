/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.SeatsAircraft;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface SeatsAircraftFacadeLocal {

    void create(SeatsAircraft seatsAircraft);

    void edit(SeatsAircraft seatsAircraft);

    void remove(SeatsAircraft seatsAircraft);

    SeatsAircraft find(Object id);

    List<SeatsAircraft> findAll();

    List<SeatsAircraft> findRange(int[] range);

    int count();
    
}
