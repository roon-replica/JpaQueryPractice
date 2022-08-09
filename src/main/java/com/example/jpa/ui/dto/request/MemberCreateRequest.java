package com.example.jpa.ui.dto.request;

import lombok.Getter;

@Getter
public class MemberCreateRequest {
    private String username;
    private String city;
    private String street;
    private String zipcode;
}
