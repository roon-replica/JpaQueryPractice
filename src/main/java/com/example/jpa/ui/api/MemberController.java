package com.example.jpa.ui.api;

import com.example.jpa.application.MemberService;
import com.example.jpa.ui.dto.request.MemberCreateRequest;
import com.example.jpa.ui.dto.response.MemberResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;

@RequestMapping("/api/member")
@RequiredArgsConstructor
@RestController
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/create")
    public String createMember(@RequestBody MemberCreateRequest request) {
        return memberService.createMember(request.getUsername(), request.getCity(), request.getStreet(), request.getZipcode(), new HashSet<>(request.getFavoriteFoods()));
    }

    @GetMapping
    public MemberResponse getMember(@RequestParam(name = "id") String memberId) {
        return memberService.getMember(memberId);
    }

}
