package com.example.demo.service.impl;

import com.example.demo.dto.HomeContentDTO;
import com.example.demo.mapper.HomeMapper;
import com.example.demo.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ananight
 * @date 2020/1/2
 */
@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    private HomeMapper homeMapper;

    @Override
    public List<HomeContentDTO> homePageInfo() {
        return homeMapper.selectAllContents();
    }

}
