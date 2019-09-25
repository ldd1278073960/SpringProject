package com.dp.qf.mapper;

import com.dp.qf.domain.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 */
public interface UserMapper {


    /**
     * 登陆功能哟
     * @param username
     * @param password
     * @return
     */
    User login(@Param("username") String username , @Param("password") String password);


    /**
     * 注册功能
     * @param user
     * @return
     */
    int register(@Param("user") User user );

}
