/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maihoanglan.dao;

import com.maihoanglan.entity.Products;
import org.springframework.data.repository.CrudRepository;


public interface ProductsDaoIF extends CrudRepository<Products, Integer>{
    
}