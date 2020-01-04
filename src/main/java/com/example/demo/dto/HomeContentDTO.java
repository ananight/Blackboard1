package com.example.demo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author ananight
 * @date 2020/1/4
 */
@Data
public class HomeContentDTO {

    private String id;

    @ApiModelProperty("日期")
    private String date;

    @ApiModelProperty("内容")
    private String content;

    @ApiModelProperty("作者")
    private String author;

}
