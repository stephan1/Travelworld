/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Airfar;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface AirfarFacadeLocal {

    void create(Airfar airfar);

    void edit(Airfar airfar);

    void remove(Airfar airfar);

    Airfar find(Object id);

    List<Airfar> findAll();

    List<Airfar> findRange(int[] range);

    int count();
    
}
