package com.springdemo.controller;

import com.springdemo.dao.MenuDao;
import com.springdemo.dto.Result;
import com.springdemo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "/getMenus", method = RequestMethod.POST)
    @ResponseBody
    @SuppressWarnings("unchecked")
    public Result<List> getAllMenus(@RequestParam int offset, @RequestParam int limit) {
        return new Result<List>().data(menuService.getAllMenus(offset, limit));

    }
}
