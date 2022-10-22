package com.example.jpa.domain.repository;

import com.example.jpa.domain.entity.Order;
import com.example.jpa.domain.value.OrderId;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository {
    Order save(Order order);

    Optional<Order> findById(OrderId id);
}
