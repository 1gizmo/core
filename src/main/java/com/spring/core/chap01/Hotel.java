package com.spring.core.chap01;

/*
*  @problem - 호텔 클래스에서 직접 객체를 생성하면 나중에 의존객체를 변경해야 할 때
*  직접 호텔 클래스를 수정해야 되므로 OCP를 위반하게 됨
*  그리고 headChef가 변경되면 레스토랑 안에 쉐프도 바뀌어야 할 때 2군데를 수정해야 함.
*
*
*/



public class Hotel {

    // 레스토랑 객체에 의존
    private Restaurant restaurant = new WesternRestaurant();

    // 헤드 쉐프
    private Chef headChef = new JannChef() ;


    // 호텔의 정보를 알려주는 기능
    public void inform() {
        System.out.printf("우리 호텔의 레스토랑은 %s입니다. 헤드 쉐프는 %s 입니다.\n"
                   , restaurant.getClass().getSimpleName()
                    ,headChef.getClass().getSimpleName()
        );

        restaurant.order();
    }


}
