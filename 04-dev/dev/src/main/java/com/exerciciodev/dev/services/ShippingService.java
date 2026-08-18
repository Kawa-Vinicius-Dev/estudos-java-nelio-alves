package com.exerciciodev.dev.services;

import com.exerciciodev.dev.order.Order;

public class ShippingService {

    public double calcularFrete(Order order) {

        if (order.getBasic() < 100) {
            return 20.0;
        } else if (order.getBasic() < 200) {
            return 12.0;
        } else {
            return 0.0;
        }
    }
}

