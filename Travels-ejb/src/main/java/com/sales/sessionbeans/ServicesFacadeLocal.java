/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Services;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface ServicesFacadeLocal {

    void create(Services services);

    void edit(Services services);

    void remove(Services services);

    Services find(Object id);

    List<Services> findAll();

    List<Services> findRange(int[] range);

    int count();
    
}
