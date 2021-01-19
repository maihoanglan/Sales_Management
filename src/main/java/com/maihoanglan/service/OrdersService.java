/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maihoanglan.service;

import com.maihoanglan.dao.OrdersDaoIF;
import com.maihoanglan.entity.Orders;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrdersService implements OrdersServiceIF {
    
    @Autowired
    OrdersDaoIF ordersDao;

    @Override
    public List<Orders> getOrders() {
        return (List<Orders>) ordersDao.findAll();
    }

    @Override
    public Orders getOrders(int id) {
        Optional<Orders> order = ordersDao.findById(id);
	return order.isPresent() ? order.get() : null;
    }
}
