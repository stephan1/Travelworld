/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Propertnationaratinlist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface PropertnationaratinlistFacadeLocal {

    void create(Propertnationaratinlist propertnationaratinlist);

    void edit(Propertnationaratinlist propertnationaratinlist);

    void remove(Propertnationaratinlist propertnationaratinlist);

    Propertnationaratinlist find(Object id);

    List<Propertnationaratinlist> findAll();

    List<Propertnationaratinlist> findRange(int[] range);

    int count();
    
}
