/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Pointsintercoordilist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface PointsintercoordilistFacadeLocal {

    void create(Pointsintercoordilist pointsintercoordilist);

    void edit(Pointsintercoordilist pointsintercoordilist);

    void remove(Pointsintercoordilist pointsintercoordilist);

    Pointsintercoordilist find(Object id);

    List<Pointsintercoordilist> findAll();

    List<Pointsintercoordilist> findRange(int[] range);

    int count();
    
}
