package com.example.grasp;

import java.util.List;

public class Customer {
    private List<Order> orders;
    // who is responsible for calculating
    // its orders because it is the information
    public void addOrder(Order newOrder){
        this.orders.add(newOrder);
    }
    public int getTotalOrders(){
        int total = 0;
        for (Order order:this.orders
             ) {
            total += order.getValue();
        }
        return total;
    }
}
