package com.zlf.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class UserVo {

    @NotNull(message = "姓名不允许为空")
    @Length(min = 3,max=10,message = "姓名长度需要在3-10之间")
    private String name;

    @Min(value = 1,message = "年龄大于0")
    @Max(value = 99,message = "年龄小于100")
    private Integer age;
    @Email(message = "邮箱地址不合法")
    private String email;
}
