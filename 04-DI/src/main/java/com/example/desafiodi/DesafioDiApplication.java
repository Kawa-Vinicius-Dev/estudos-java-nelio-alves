package com.example.desafiodi;

import com.example.desafiodi.order.Order;
import com.example.desafiodi.service.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class DesafioDiApplication implements CommandLineRunner {

    private OrderService orderService;

    public DesafioDiApplication(OrderService orderService) {
        this.orderService = orderService;
    }

    public static void main(String[] args) {
        SpringApplication.run(DesafioDiApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        for (Order o : new Order[]{

                new Order(1034, 150.0, 20.0),
                new Order(2282, 800.0, 10.0),
                new Order(1309, 95.90, 0.0)}) {

            System.out.printf(Locale.US, "%nPedido código %d%nValor total: R$ %.2f%n========",
                    o.getCode(), orderService.total(o));

        }
    }
}
