/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Propertyroomslist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface PropertyroomslistFacadeLocal {

    void create(Propertyroomslist propertyroomslist);

    void edit(Propertyroomslist propertyroomslist);

    void remove(Propertyroomslist propertyroomslist);

    Propertyroomslist find(Object id);

    List<Propertyroomslist> findAll();

    List<Propertyroomslist> findRange(int[] range);

    int count();
    
}
