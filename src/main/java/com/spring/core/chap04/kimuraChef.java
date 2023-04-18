package com.spring.core.chap04;

import org.springframework.stereotype.Component;

@Component("kc")
public class kimuraChef implements Chef {

    public void cook() {
        System.out.println("와사비 테러 장인 재패니즈 쿠킹입니다 ^ ^");
    }

}
