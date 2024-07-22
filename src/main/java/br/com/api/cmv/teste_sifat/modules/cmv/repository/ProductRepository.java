package br.com.api.cmv.teste_sifat.modules.cmv.repository;

import br.com.api.cmv.teste_sifat.modules.cmv.entities.ProductEntity;
import br.com.api.cmv.teste_sifat.modules.cmv.projections.BestSellingGroupProjection;
import br.com.api.cmv.teste_sifat.modules.cmv.projections.LeastSoldProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    List<ProductEntity> findAll();

    @Query("SELECT p.id AS product, p.name AS productName, SUM(o.quantity) AS totalSales " +
            "FROM ProductEntity p " +
            "JOIN p.orderEntity o " +
            "GROUP BY p.id, p.name " +
            "ORDER BY SUM(o.quantity) ASC")
    List<LeastSoldProductProjection> findLeastSoldProducts();
}
