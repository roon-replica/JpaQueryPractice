package com.example.jpa.ui.api;

import com.example.jpa.application.member.MemberService;
import com.example.jpa.ui.dto.MemberCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/member")
@RequiredArgsConstructor
@RestController
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/create")
    public Long createMember(@RequestBody MemberCreateRequest request) {
        return memberService.createMember(request.getUsername(), request.getCity(), request.getStreet(), request.getZipcode());
    }
}
