/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.sessionbeans;

import com.sales.entities.Whattoexpectlist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author steve
 */
@Local
public interface WhattoexpectlistFacadeLocal {

    void create(Whattoexpectlist whattoexpectlist);

    void edit(Whattoexpectlist whattoexpectlist);

    void remove(Whattoexpectlist whattoexpectlist);

    Whattoexpectlist find(Object id);

    List<Whattoexpectlist> findAll();

    List<Whattoexpectlist> findRange(int[] range);

    int count();
    
}
