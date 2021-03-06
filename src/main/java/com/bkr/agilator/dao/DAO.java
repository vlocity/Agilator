/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bkr.agilator.dao;

import java.util.List;

/**
 *
 * @author Ramzi Ben Khedhiri <bk.ramzi@gmail.com>
 * @param <T>
 */
public interface DAO<T> {
    
    void insert(T o);
    
    T find(Long id);
    
    T merge(T o);
    
    boolean contains(T o);
    
    void delete(T o);
    
    List findAll();
    
    void flush();
}
