/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Regioneanhotelidmapping;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface RegioneanhotelidmappingFacadeLocal {

    void create(Regioneanhotelidmapping regioneanhotelidmapping);

    void edit(Regioneanhotelidmapping regioneanhotelidmapping);

    void remove(Regioneanhotelidmapping regioneanhotelidmapping);

    Regioneanhotelidmapping find(Object id);

    List<Regioneanhotelidmapping> findAll();

    List<Regioneanhotelidmapping> findRange(int[] range);

    int count();
    
}
