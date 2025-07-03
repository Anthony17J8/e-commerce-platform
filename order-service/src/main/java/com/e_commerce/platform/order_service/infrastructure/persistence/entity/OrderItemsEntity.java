package com.e_commerce.platform.order_service.infrastructure.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "order_items", schema = "order_service_schema")
public class OrderItemsEntity extends AbstractEntity<Long> {

    @Id
    private Long id;

    @Column(name = "order_id")
    private UUID orderId;

    @Column(name = "product_id")
    private UUID productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "price_per_unit")
    private BigDecimal pricePerUnit;

    @Column(name = "quantity")
    private Long quantity;

    @Override
    public Long getId() {
        return id;
    }
}
