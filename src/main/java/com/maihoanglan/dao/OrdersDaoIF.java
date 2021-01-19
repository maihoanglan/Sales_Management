/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maihoanglan.dao;

import com.maihoanglan.entity.Orders;
import org.springframework.data.repository.CrudRepository;


public interface OrdersDaoIF extends CrudRepository<Orders, Integer>{
    
}
