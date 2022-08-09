package com.example.jpa.infra;

import com.example.jpa.domain.UuidGenerator;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UuidGeneratorImpl implements UuidGenerator {

    @Override
    public String generate() {
        int UUID_LENGTH = 8;
        return UUID.randomUUID().toString().substring(0, UUID_LENGTH);
    }
}
