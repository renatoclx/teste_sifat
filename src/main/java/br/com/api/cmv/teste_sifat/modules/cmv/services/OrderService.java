package br.com.api.cmv.teste_sifat.modules.cmv.services;

import br.com.api.cmv.teste_sifat.modules.cmv.entities.OrderEntity;
import br.com.api.cmv.teste_sifat.modules.cmv.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<OrderEntity> getAllOrders() {
        return orderRepository.findAll();
    }

}
