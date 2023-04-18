package com.spring.core.chap03;

public class Hotel {
    public Hotel() {

    }

    // 제어의 역전(Ioc) : 객체 생성의 제어권을 외부로 넘긴다
    // 의존성 주입(DI) : 외부에서 생성된 객체를 주입받는 개념

    // Setter 주입 ( 수정자 주입 )
    public void setHeadChef(Chef headChef) {
        this.headChef = headChef;
    }

    // Setter 주입 ( 수정자 주입 )
    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    // 생성자 주입
    public Hotel(Restaurant restaurant, Chef headChef) {
        this.restaurant = restaurant;
        this.headChef = headChef;
    }

    // 레스토랑 객체에 의존
    private Restaurant restaurant ;

    // 헤드 쉐프
    private Chef headChef ;


    // 호텔의 정보를 알려주는 기능
    public void inform() {
        System.out.printf("우리 호텔의 레스토랑은 %s입니다. 헤드 쉐프는 %s 입니다.\n"
                   , restaurant.getClass().getSimpleName()
                    ,headChef.getClass().getSimpleName()
        );

        restaurant.order();
    }


}
