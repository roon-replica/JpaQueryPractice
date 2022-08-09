package com.example.jpa.application.member;

import com.example.jpa.domain.entity.Member;
import com.example.jpa.domain.entity.MemberRepository;
import com.example.jpa.domain.value.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public Long createMember(String username, String city, String street, String zipcode) {
        return memberRepository.createMember(
                Member.builder()
                        .username(username)
                        .address(
                                Address.builder()
                                        .city(city)
                                        .street(street)
                                        .zipcode(zipcode)
                                        .build()
                        )
                        .build()
        ).getId();
    }
}
