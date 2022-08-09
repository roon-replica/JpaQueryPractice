package com.example.jpa.ui.api;

import com.example.jpa.application.member.MemberService;
import com.example.jpa.ui.dto.request.MemberCreateRequest;
import com.example.jpa.ui.dto.response.MemberResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/member")
@RequiredArgsConstructor
@RestController
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/create")
    public String createMember(@RequestBody MemberCreateRequest request) {
        return memberService.createMember(request.getUsername(), request.getCity(), request.getStreet(), request.getZipcode());
    }

    @GetMapping("/{memberId}")
    public MemberResponse getMember(@PathVariable String memberId) {
        return memberService.getMember(memberId);
    }

}
