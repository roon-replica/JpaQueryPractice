package com.example.jpa.application.member;

import com.example.jpa.domain.UuidGenerator;
import com.example.jpa.domain.entity.Member;
import com.example.jpa.domain.repository.MemberRepository;
import com.example.jpa.domain.value.Address;
import com.example.jpa.domain.value.MemberId;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;
    private final UuidGenerator uuidGenerator;

    public String createMember(String username, String city, String street, String zipcode) {
        var member = Member.create(
                uuidGenerator.generate(),
                username,
                Address.builder()
                        .city(city)
                        .street(street)
                        .zipcode(zipcode)
                        .build()
        );

        return memberRepository.save(member)
                .getId().getId();
    }
}
