package br.com.api.cmv.teste_sifat.modules.cmv.repository;

import br.com.api.cmv.teste_sifat.modules.cmv.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

    List<OrderEntity> findAll();

}
