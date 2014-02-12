/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Properroomlist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface ProperroomlistFacadeLocal {

    void create(Properroomlist properroomlist);

    void edit(Properroomlist properroomlist);

    void remove(Properroomlist properroomlist);

    Properroomlist find(Object id);

    List<Properroomlist> findAll();

    List<Properroomlist> findRange(int[] range);

    int count();
    
}
