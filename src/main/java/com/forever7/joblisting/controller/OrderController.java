package com.forever7.joblisting.controller;

import com.forever7.joblisting.model.Order;
import com.forever7.joblisting.repository.OrderRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderRepository orderRepository;
    @PostMapping("/createOrder")
    public void createOrder(@RequestBody Order order, HttpServletResponse response) throws IOException {
        try {
            System.out.println(order+"bharat");
            orderRepository.save(order);
            response.setStatus(HttpServletResponse.SC_CREATED);
            response.getWriter().println("Order is created Successfully");

        }catch (Exception err) {
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.getWriter().println("Error in fetching" + err.getMessage());
        }
    }

    @GetMapping("/getAllOrders")
    public void getAllOrders(HttpServletResponse response) throws IOException{
        try {
           List<Order> orders  = orderRepository.findAll();
           response.getWriter().println(orders.toString()+"Get All the order");
        }catch (Exception err){
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.getWriter().println("Error while fetching"+ err.getMessage());
        }
    }
}
