package com.example.jpa.domain.value;

import com.example.jpa.domain.UuidGenerator;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Embeddable
public class MemberId implements Serializable {
    private String id;

    public static MemberId of(String uuid) {
        return new MemberId(uuid);
    }
}
