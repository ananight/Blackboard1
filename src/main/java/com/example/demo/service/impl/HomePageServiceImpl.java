package com.example.demo.service.impl;

import com.example.demo.service.HomePageService;
import org.springframework.stereotype.Component;

@Component
public class HomePageServiceImpl implements HomePageService {


    public String homePageInfo() {
        return "hello! This is home page!";
    }


}
