package com.ecc.oraclemybatisplus.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ecc.oraclemybatisplus.mapper.UserMapper2;
import com.ecc.oraclemybatisplus.pojo.User;
import com.ecc.oraclemybatisplus.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author sunyc
 * @create 2022-07-05 16:58
 */
@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper2, User> implements UserService {
}
