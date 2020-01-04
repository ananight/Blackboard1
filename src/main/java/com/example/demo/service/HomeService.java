package com.example.demo.service;

import com.example.demo.dto.HomeContentDTO;

import java.util.List;

/**
 * @author ananight
 * @date 2020/1/2
 */
public interface HomeService {

    /**
     * 主页信息
     * @return
     */
    List<HomeContentDTO> homePageInfo();

}
