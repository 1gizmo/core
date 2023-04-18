package com.spring.core.chap02;

public class EasternRestaurant implements Restaurant {

    // 생성자 주입
    // 누군가가 만들어서 넣어주게 만들어줌
    public EasternRestaurant(Chef chef, Course course) {
        this.chef = chef;
        this.course = course;
    }

    //쉐프
    private Chef chef;

    // 요리코스
    private Course course ;

    // 요리를 주문하는 기능
    public void order() {
        System.out.println("아시아의 요리왕 쿡킹의 요리를 주문합니다");
        course.combineMenu();
        chef.cook();
    }

}
