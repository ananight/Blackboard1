package com.example.demo.controller;

import com.example.demo.service.HomePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {

    @Autowired
    private HomePageService homePageService;

    @RequestMapping("/")
    public String homeController() {

        return homePageService.homePageInfo();


    }

}
