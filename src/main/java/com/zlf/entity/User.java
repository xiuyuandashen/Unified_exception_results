package com.zlf.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Long id;
    private String name;
    private Integer age;
    private String email;
    private Date create_time;
    private Date update_time;
    private Integer version;
    private Integer deleted;

}
