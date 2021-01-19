/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maihoanglan.service;

import com.maihoanglan.dao.ProductsDaoIF;
import com.maihoanglan.entity.Products;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductsService implements ProductsServiceIF {
    
    @Autowired
    ProductsDaoIF productsDao;

    @Override
    public List<Products> getProducts() {
        return (List<Products>) productsDao.findAll();
    }

    @Override
    public Products getProduct(int id) {
        Optional<Products> product = productsDao.findById(id);
	return product.isPresent() ? product.get() : null;
    }
}
