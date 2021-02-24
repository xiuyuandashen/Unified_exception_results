package com.zlf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zlf.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface userMapper extends BaseMapper<User> {

}
