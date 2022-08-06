package com.example.jpa.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_item_id")
    private Long id;

    @JoinColumn(name = "order_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Order order;

    @JoinColumn(name = "item_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Item item;

    private int orderPrice;

    private int count;

    public void setOrder(Order order){
        this.order = order;
    }

//    public void setItem(Item item){
//        this.item = item;
//    }
}
