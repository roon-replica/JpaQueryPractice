package com.example.jpa.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="item_id")
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "item")
//    private List<OrderItem> orderItems = new ArrayList<>();
//
//    public void addOrderItem(OrderItem orderItem) {
//        orderItems.add(orderItem);
//        orderItem.setItem(this);
//    }
}
