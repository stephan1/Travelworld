/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Hotelimagelist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface HotelimagelistFacadeLocal {

    void create(Hotelimagelist hotelimagelist);

    void edit(Hotelimagelist hotelimagelist);

    void remove(Hotelimagelist hotelimagelist);

    Hotelimagelist find(Object id);

    List<Hotelimagelist> findAll();

    List<Hotelimagelist> findRange(int[] range);

    int count();
    
}
