package com.example.jpa.infra;

import com.example.jpa.domain.entity.Order;
import com.example.jpa.domain.value.OrderId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderJpaRepository extends JpaRepository<Order, OrderId> {
}
