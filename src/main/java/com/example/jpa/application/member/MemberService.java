package com.example.jpa.application.member;

import com.example.jpa.domain.UuidGenerator;
import com.example.jpa.domain.entity.Member;
import com.example.jpa.domain.repository.MemberRepository;
import com.example.jpa.domain.value.Address;
import com.example.jpa.domain.value.MemberId;
import com.example.jpa.ui.dto.response.MemberResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;
    private final UuidGenerator uuidGenerator;

    @Transactional
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

    public MemberResponse getMember(String uuid){
        var member = memberRepository.findById(MemberId.of(uuid))
                .orElseThrow(EntityNotFoundException::new);

        return MemberResponse.builder()
                .username(member.getUsername())
                .city(member.getAddress().getCity())
                .build();
    }
}
