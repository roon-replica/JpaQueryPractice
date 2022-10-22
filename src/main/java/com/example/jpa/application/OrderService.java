package com.example.jpa.application;

import com.example.jpa.domain.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class OrderService {
    private final OrderRepository orderRepository;

}
