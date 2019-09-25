package com.dp.qf.service.impl;

import com.dp.qf.domain.entity.User;
import com.dp.qf.mapper.UserMapper;
import com.dp.qf.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        return userMapper.login(username , password);
    }

    @Override
    public int register(User user) {
        return userMapper.register(user);
    }
}
