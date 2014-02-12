/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Route;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface RouteFacadeLocal {

    void create(Route route);

    void edit(Route route);

    void remove(Route route);

    Route find(Object id);

    List<Route> findAll();

    List<Route> findRange(int[] range);

    int count();
    
}
