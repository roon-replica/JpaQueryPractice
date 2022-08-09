package com.example.jpa.domain.entity;

import com.example.jpa.domain.value.Address;
import com.example.jpa.domain.value.MemberId;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
@Entity
public class Member {
    @EmbeddedId
    private MemberId id;

    private String username;

    private Address address;

    @ElementCollection
    @CollectionTable(
            name = "favorite_foods",
            joinColumns = @JoinColumn(name = "member_id"))
    @Column(name = "food_name")
    private Set<String> favoriteFoods = new HashSet<>();

    @ElementCollection
    @CollectionTable(
            name = "address",
            joinColumns = @JoinColumn(name = "member_id"))
    private List<Address> addressHistory = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
        order.setMember(this);
    }

    public static Member create(String uuid, String username, Address address,Set<String> favoriteFoods) {
        return Member.builder()
                .id(MemberId.of(uuid))
                .username(username)
                .address(address)
                .favoriteFoods(favoriteFoods)
                .build();
    }
}
