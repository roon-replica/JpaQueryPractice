package com.example.jpa.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "orders") // 이거 안 붙이니 auto-ddl 에러났음..!! mysql에서 order이 무슨 예약어같은거 인가 봄....
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

    @JoinColumn(name = "member_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    private LocalDateTime orderDate;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
    private List<OrderItem> orderItems = new ArrayList<>();

    // TODO: 여기서 설정 안 하고 Member 엔티티에서 설정하면 코드 더 간단해지는거 아님?
//    public void setMember(Member member) {
//        if (member == null) {
//            throw new IllegalArgumentException("NPE");
//        }
//
//        this.member.getOrders().remove(member);
//        this.member = member;
//        member.getOrders().add(this);
//    }

    public void setMember(Member member) {
        this.member = member;
    }

    public void addOrderItem(OrderItem orderItem) {
        orderItems.add(orderItem);
        orderItem.setOrder(this);
    }

}
