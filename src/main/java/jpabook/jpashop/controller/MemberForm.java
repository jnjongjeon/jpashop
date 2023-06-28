package jpabook.jpashop.controller;

import lombok.Getter;
import lombok.Setter;;import javax.validation.constraints.NotNull;

@Getter
@Setter
public class MemberForm {

    @NotNull(message = "이름 입력 필수")
    private String name;
    private String city;
    private String street;
    private String zipcode;
}
