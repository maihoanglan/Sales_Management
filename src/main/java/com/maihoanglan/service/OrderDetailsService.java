/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maihoanglan.service;

import com.maihoanglan.dao.OrderDetailsDaoIF;
import com.maihoanglan.entity.OrderDetails;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderDetailsService implements OrderDetailsServiceIF {
    
    @Autowired
    OrderDetailsDaoIF orderDetailsDao;

    @Override
    public List<OrderDetails> getOrderDetails() {
        return (List<OrderDetails>) orderDetailsDao.findAll();
    }

    @Override
    public OrderDetails geOrderDetails(int id) {
        Optional<OrderDetails> orderDetail = orderDetailsDao.findById(id);
	return orderDetail.isPresent() ? orderDetail.get() : null;

    }
}
