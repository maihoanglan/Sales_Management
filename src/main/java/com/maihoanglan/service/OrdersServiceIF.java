/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maihoanglan.service;

import com.maihoanglan.entity.Orders;
import java.util.List;


public interface OrdersServiceIF {
    public List<Orders> getOrders();
    public Orders getOrders(int id);
    public Orders findOrdersByCustomerNameLikeOr
}
