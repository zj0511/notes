package com.springdemo.controller;

import com.springdemo.dto.Result;
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
public class RoleController {

    private static final Log logger = LogFactory.getLog(RoleController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "getRole", method = RequestMethod.POST)
    @ResponseBody
    public Result getRoleById(@RequestParam String id) {
        logger.info("getRoleById");
        return Result.ok("获取成功", userService.getUserById(id));
    }

}
