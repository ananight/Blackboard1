package com.example.demo.service.impl;

import com.example.demo.service.HomeService;
import org.springframework.stereotype.Service;

/**
 * @author ananight
 * @date 2020/1/2
 */
@Service
public class HomeServiceImpl implements HomeService {

    @Override
    public String homePageInfo() {
        return "home page info";
    }

}
