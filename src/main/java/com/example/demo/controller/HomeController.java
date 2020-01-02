package com.example.demo.controller;

import com.example.demo.service.HomeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ananight
 * @date 2020/1/2
 */
@RestController
@RequestMapping("/api")
@Api(description = "主页接口")
public class HomeController {

    @Autowired
    private HomeService homeService;

    @RequestMapping(value = "/home/page", method = RequestMethod.GET)
    @ApiOperation(value = "获取主页信息", response = String.class)
    public String homePage() {
        return homeService.homePageInfo();
    }

}
