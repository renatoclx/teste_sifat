package br.com.api.cmv.teste_sifat.modules.cmv.controllers;

import br.com.api.cmv.teste_sifat.modules.cmv.entities.OrderEntity;
import br.com.api.cmv.teste_sifat.modules.cmv.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/all")
    public List<OrderEntity> getAllOrders() {
        return orderService.getAllOrders();
    }

}
