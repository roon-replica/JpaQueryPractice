package com.example.jpa.infra;

import com.example.jpa.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberJpaRepository extends JpaRepository<Member, Long> {
}
