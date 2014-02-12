/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Spadescriptlist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface SpadescriptlistFacadeLocal {

    void create(Spadescriptlist spadescriptlist);

    void edit(Spadescriptlist spadescriptlist);

    void remove(Spadescriptlist spadescriptlist);

    Spadescriptlist find(Object id);

    List<Spadescriptlist> findAll();

    List<Spadescriptlist> findRange(int[] range);

    int count();
    
}
