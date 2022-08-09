package com.example.jpa.ui.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Builder
@Getter
public class MemberFavoriteFoodsResponse {
    private String memberId;
    private String username;
    private String city;
    private List<String> favoriteFoods;
}
