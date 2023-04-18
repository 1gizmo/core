package com.spring.core.chap02;

public class WesternRestaurant implements Restaurant {

    // 객체 생성에 제어권을 외부로 넘기는것
    // 생성자 주입
    public WesternRestaurant(Chef chef, Course course) {
        this.chef = chef;
        this.course = course;
    }

    //쉐프
    private Chef chef ;

    // 요리코스
    private Course course ;

    // 요리를 주문하는 기능
    public void order() {
        System.out.println("서양의 요리왕 쿠킹의 요리를 주문합니다");
        course.combineMenu();
        chef.cook();
    }

}
