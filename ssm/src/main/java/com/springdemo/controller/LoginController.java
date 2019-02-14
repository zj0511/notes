package com.springdemo.controller;

import com.springdemo.dto.MD5;
import com.springdemo.dto.Result;
import com.springdemo.entity.User;
import com.springdemo.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    private static final Log logger = LogFactory.getLog(LoginController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public Result toLogin(@RequestParam String userName, @RequestParam String passWord) {
        logger.info("toLogin");
        User user = userService.getUserByName(userName);

        try {
            if (MD5.verify(passWord, "zj", user.getPassword())) {
                return Result.ok("登录成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.error("登录失败");
    }
}
