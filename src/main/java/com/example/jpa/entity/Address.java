package com.example.jpa.entity;

import lombok.Getter;

import javax.persistence.Embeddable;

@Getter
@Embeddable // 이렇게 정의하는 곳에 @Embeddable를 붙이거나 Member의 Address 필드에 @Embedded를 붙이면 됨.
public class Address {
    private String city;
    private String street;
    private String zipcode;
}
