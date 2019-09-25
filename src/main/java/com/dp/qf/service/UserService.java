package com.dp.qf.service;

import com.dp.qf.domain.entity.User;

/**
 * @author Administrator
 */
public interface UserService {

    /**
     * 登陆
     * @param username 用户名
     * @param password 密码
     * @return username , password
     */
    User login(String username ,String password);

    /**
     * 注册
     * @param user 注册的用户所有信息
     * @return user
     */
    int register(User user );

}
