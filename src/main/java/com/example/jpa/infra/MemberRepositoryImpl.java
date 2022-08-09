package com.example.jpa.infra;

import com.example.jpa.domain.entity.Member;
import com.example.jpa.domain.entity.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberRepositoryImpl implements MemberRepository {
    private final MemberJpaRepository memberJpaRepository;

    @Override
    public Member createMember(Member member) {
        return memberJpaRepository.save(member);
    }
}
