package com.example.jpa.entity;

import lombok.Getter;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Getter
@Embeddable
public class PhoneNumber {
    private String areaCode;
    private String localNumber;
    private String actualNumber;

    @ManyToOne
    private PhoneServiceProvider phoneServiceProvider;  // 엔티티 참조하는거라는데.. 이러면 뭐 어떻게 됨? 이게 무슨 의미?
}
