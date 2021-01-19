/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maihoanglan.controller;

import com.maihoanglan.entity.OrderDetails;
import com.maihoanglan.entity.Orders;
import com.maihoanglan.service.OrderDetailsServiceIF;
import com.maihoanglan.service.OrdersServiceIF;
import com.maihoanglan.service.ProductsServiceIF;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ListController {
    
    @Autowired
    OrdersServiceIF ordersService;
    
    @Autowired
    ProductsServiceIF productsService;
    
    @Autowired
    OrderDetailsServiceIF orderDetailsService;
    
    @GetMapping
    public String ListAllOrders(Model model) {
        List<Orders> list = ordersService.getOrders();
        model.addAttribute("listOrders", list);
        
        return "list-page";
    }
    
    @GetMapping(value = "/{id}")
    public String ListDetails(@PathVariable int id, Model model) {
        Orders order = ordersService.getOrders(id);
        List<OrderDetails> listOrderDetail = order.getListOrderDetails();
        model.addAttribute("listOrderDetail", listOrderDetail);
        return "details-page";
    }
    
    @GetMapping(value = "/{text}")
    public String ListOrder(@PathVariable String text, Model model) {
    	
    	
    	return "list-page";
    }
}
