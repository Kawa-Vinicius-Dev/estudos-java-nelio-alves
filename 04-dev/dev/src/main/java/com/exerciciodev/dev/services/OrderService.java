package com.exerciciodev.dev.services;

import com.exerciciodev.dev.order.Order;


public class OrderService {

    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order) {
        return order.getBasic() - (order.getBasic() * (order.getDiscount() / 100)) - shippingService.calcularFrete(order);
    }
}
