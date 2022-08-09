package com.example.jpa.domain.repository;

import com.example.jpa.domain.entity.Member;
import com.example.jpa.domain.value.MemberId;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository {
    Member save(Member member);

    Optional<Member> findById(MemberId id);
}
