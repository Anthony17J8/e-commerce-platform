package com.e_commerce.platform.order_service.domain.repository;

import com.e_commerce.platform.order_service.infrastructure.persistence.entity.OrderEntity;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderRepository extends ListCrudRepository<OrderEntity, UUID> {
}
