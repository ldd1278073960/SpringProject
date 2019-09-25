package com.dp.qf.controller;

import com.dp.qf.domain.entity.User;
import com.dp.qf.service.UserService;
import com.dp.qf.utils.AesEncryptUtils;
import com.dp.qf.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@Controller
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 登陆加密功能
     * @param username 用户名
     * @param password 密码
     * @return user
     */
    @RequestMapping("/login")
    @ResponseBody
    public Object login(String username ,String password){
        try {
            String decrypt = AesEncryptUtils.encrypt(password);
            User login = userService.login(username, decrypt);
            if (login != null){
                return Result.success(login);
            }else {
                return Result.error();
            }
        } catch (Exception e) {
            log.error(e.getMessage());
            return Result.error() + "错误";
        }
    }

    /**
     * 注册
     * @param user 用户详情
     * @return  user
     */
    @PostMapping("/register")
    @ResponseBody
    public Object register( @RequestBody User user){
        try{
            String decrypt = AesEncryptUtils.encrypt(user.getPassword());
            user.setPassword(decrypt);
            int register = userService.register(user);
            if (register > 0) {
                return Result.success(register);
            }else {
                return  Result.error();
            }
        }catch (Exception e){
            log.error(e.getMessage());
            return Result.error() + "错误";
        }
    }

}
