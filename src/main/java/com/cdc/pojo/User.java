package com.cdc.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class User {

    @Getter
    @Setter
    private Integer id;

    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private Integer age;

    @Getter
    @Setter
    private String phone;

    @Getter
    @Setter
    private String desc;


}
