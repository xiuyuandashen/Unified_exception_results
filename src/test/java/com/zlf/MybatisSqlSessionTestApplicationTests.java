package com.zlf;

import com.zlf.dao.userMapper;
import com.zlf.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@SpringBootTest
class MybatisSqlSessionTestApplicationTests {

    @Autowired
    com.zlf.dao.userMapper userMapper;


    @Transactional(rollbackFor = Exception.class)
    @Test
    public void contextLoads() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

}
