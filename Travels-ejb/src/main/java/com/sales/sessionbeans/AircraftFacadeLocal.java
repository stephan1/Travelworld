/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Aircraft;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface AircraftFacadeLocal {

    void create(Aircraft aircraft);

    void edit(Aircraft aircraft);

    void remove(Aircraft aircraft);

    Aircraft find(Object id);

    List<Aircraft> findAll();

    List<Aircraft> findRange(int[] range);

    int count();
    
}
