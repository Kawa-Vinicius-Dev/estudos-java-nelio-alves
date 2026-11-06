package com.example.desafiodi.service;

import com.example.desafiodi.order.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order){
       return order.getBasic() - (order.getBasic() * (order.getDiscount() / 100)) + shippingService.shipment(order);
    }

}
