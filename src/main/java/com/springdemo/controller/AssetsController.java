package com.springdemo.controller;

import com.springdemo.dto.Result;
import com.springdemo.entity.Assets;
import com.springdemo.service.AssetsService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AssetsController {

    private static final Log logger = LogFactory.getLog(AssetsController.class);

    @Autowired
    private AssetsService assetsService;

    @RequestMapping(value = "getAssets", method = RequestMethod.POST)
    @ResponseBody
    public Result getAssetsById(@RequestParam String id) {
        logger.info("getAssetsById");
        return Result.ok("获取成功", assetsService.getAssetsById(id));
    }
}
