package com.example.demo.api.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel(value = "User", description = "User 모델입니다.")
public class User {
    @ApiModelProperty(value = "네임", notes = "이름에 대한 노트", example = "장우성")
    private String nm;
    @ApiModelProperty(value = "나이", notes = "나이에 대한 노트", example = "15")
    private long age;
}
