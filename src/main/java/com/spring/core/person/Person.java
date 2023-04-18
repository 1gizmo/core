package com.spring.core.person;


import lombok.*;

//@Setter @Getter @ToString @EqualsAndHashCode
//@NoArgsConstructor //기본 생성자
//@AllArgsConstructor // 모든 파라미터 생성자
@Data // 실무에서 안쓰는게 좋음. 상황에 따라 유동적으로 만들어야하기 때문에 커스텀 불가능
public class Person {

    private String nickName;

    private String address;

    private int age;


}
