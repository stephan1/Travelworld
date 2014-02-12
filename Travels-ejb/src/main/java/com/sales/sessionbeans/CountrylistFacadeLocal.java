/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Countrylist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface CountrylistFacadeLocal {

    void create(Countrylist countrylist);

    void edit(Countrylist countrylist);

    void remove(Countrylist countrylist);

    Countrylist find(Object id);

    List<Countrylist> findAll();

    List<Countrylist> findRange(int[] range);

    int count();
    
}
