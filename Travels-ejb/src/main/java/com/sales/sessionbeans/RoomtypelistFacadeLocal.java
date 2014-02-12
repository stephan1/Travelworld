/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Roomtypelist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface RoomtypelistFacadeLocal {

    void create(Roomtypelist roomtypelist);

    void edit(Roomtypelist roomtypelist);

    void remove(Roomtypelist roomtypelist);

    Roomtypelist find(Object id);

    List<Roomtypelist> findAll();

    List<Roomtypelist> findRange(int[] range);

    int count();
    
}
