package br.com.api.cmv.teste_sifat.modules.cmv.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "total_cost")
    private Double totalCost;

    @ManyToOne()
    @JoinColumn(name = "product_id")
    private ProductEntity productEntity;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
