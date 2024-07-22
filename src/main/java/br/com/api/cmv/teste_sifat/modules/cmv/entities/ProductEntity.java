package br.com.api.cmv.teste_sifat.modules.cmv.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
@JsonIgnoreProperties({"groupEntity", "orderEntity"})
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "sale_price")
    private Double salePrice;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private GroupEntity groupEntity;

    @OneToMany(mappedBy = "productEntity", cascade = CascadeType.ALL)
    private List<OrderEntity> orderEntity;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
