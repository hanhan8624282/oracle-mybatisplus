package com.ecc.oraclemybatisplus.mapper;

import com.ecc.oraclemybatisplus.pojo.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author sunyc
 * @create 2022-07-05 16:12
 */
@Mapper
public interface UserMapper {
    @Select("select * from xulei.syc_user")
    public List<User> getAll();
}
