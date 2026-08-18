package com.exerciciodev.dev;

import com.exerciciodev.dev.order.Order;
import com.exerciciodev.dev.services.OrderService;
import com.exerciciodev.dev.services.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DevApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Order order = new Order(231, 180, 10);

        ShippingService shippingService = new ShippingService();
        OrderService orderService = new OrderService(shippingService);

        System.out.println(order);
        System.out.println(shippingService.calcularFrete(order));
        System.out.println(orderService.total(order));
    }
}
