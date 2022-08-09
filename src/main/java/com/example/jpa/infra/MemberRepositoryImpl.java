package com.example.jpa.infra;

import com.example.jpa.domain.entity.Member;
import com.example.jpa.domain.repository.MemberRepository;
import com.example.jpa.domain.value.MemberId;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MemberRepositoryImpl implements MemberRepository {
    private final MemberJpaRepository memberJpaRepository;

    @Override
    public Member save(Member member) {
        return memberJpaRepository.save(member);
    }

    @Override
    public Optional<Member> findById(MemberId id) {
        return memberJpaRepository.findById(id);
    }
}
