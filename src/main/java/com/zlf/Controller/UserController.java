package com.zlf.Controller;

import com.zlf.basis.AppCode;
import com.zlf.basis.ResultVo;
import com.zlf.dao.userMapper;
import com.zlf.entity.User;
import com.zlf.entity.UserVo;
import com.zlf.error.AppException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.CustomSQLErrorCodesTranslation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    userMapper userMapper;

    @PostMapping("/find")
    public ResultVo findByUser(@RequestBody @Validated UserVo userVo){
        System.out.println(userVo);
        boolean flag = true;
        if(flag) throw new AppException("测试异常~~");

        return new ResultVo<UserVo>(userVo);
    }
}
