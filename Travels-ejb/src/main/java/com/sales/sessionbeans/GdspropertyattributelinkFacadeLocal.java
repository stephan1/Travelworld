/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Gdspropertyattributelink;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface GdspropertyattributelinkFacadeLocal {

    void create(Gdspropertyattributelink gdspropertyattributelink);

    void edit(Gdspropertyattributelink gdspropertyattributelink);

    void remove(Gdspropertyattributelink gdspropertyattributelink);

    Gdspropertyattributelink find(Object id);

    List<Gdspropertyattributelink> findAll();

    List<Gdspropertyattributelink> findRange(int[] range);

    int count();
    
}
