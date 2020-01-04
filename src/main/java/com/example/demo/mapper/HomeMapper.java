package com.example.demo.mapper;

import com.example.demo.dto.HomeContentDTO;

import java.util.List;

/**
 * @author ananight
 * @date 2020/1/4
 */
public interface HomeMapper {

    List<HomeContentDTO> selectAllContents();

}
