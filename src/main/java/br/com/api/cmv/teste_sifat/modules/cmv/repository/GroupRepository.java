package br.com.api.cmv.teste_sifat.modules.cmv.repository;

import br.com.api.cmv.teste_sifat.modules.cmv.entities.GroupEntity;
import br.com.api.cmv.teste_sifat.modules.cmv.projections.BestSellingGroupProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupRepository extends JpaRepository<GroupEntity, Long> {

    List<GroupEntity> findAll();

    @Query("SELECT g.id AS groupId, g.name AS groupName, SUM(o.quantity) AS totalSales " +
            "FROM GroupEntity g " +
            "JOIN g.productEntity p " +
            "JOIN p.orderEntity o " +
            "GROUP BY g.id, g.name " +
            "ORDER BY SUM(o.quantity) DESC")
    List<BestSellingGroupProjection> findBestSellingGroups();

}
