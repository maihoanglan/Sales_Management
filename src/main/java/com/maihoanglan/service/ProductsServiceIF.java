/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maihoanglan.service;

import com.maihoanglan.entity.Products;
import java.util.List;


public interface ProductsServiceIF {
    public List<Products> getProducts();
    public Products getProduct(int id);
}
