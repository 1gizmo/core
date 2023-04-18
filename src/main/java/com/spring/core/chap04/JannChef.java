package com.spring.core.chap04;

import org.springframework.stereotype.Component;

@Component("jc")
public class JannChef implements Chef {

    public void cook() {
        System.out.println("프랑스 민달팽이 요리왕 쿠킹입니다 ^ ^");
    }

}
