package com.example.jpa.domain.repository;

import com.example.jpa.domain.entity.Member;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository {
    Member save(Member member);
}
