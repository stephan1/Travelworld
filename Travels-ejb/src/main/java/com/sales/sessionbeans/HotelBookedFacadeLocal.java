/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.HotelBooked;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface HotelBookedFacadeLocal {

    void create(HotelBooked hotelBooked);

    void edit(HotelBooked hotelBooked);

    void remove(HotelBooked hotelBooked);

    HotelBooked find(Object id);

    List<HotelBooked> findAll();

    List<HotelBooked> findRange(int[] range);

    int count();
    
}
