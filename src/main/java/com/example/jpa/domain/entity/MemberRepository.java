package com.example.jpa.domain.entity;

import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository {
    Member createMember(Member member);
}
