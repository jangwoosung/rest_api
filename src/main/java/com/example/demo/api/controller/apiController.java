package com.example.demo.api.controller;

import com.example.demo.api.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@Api(value = "apiCopntroller API 입니다.")
public class apiController {

    @ApiOperation(value = "간략한 설명(제목)", notes = "상세설명.")
    @GetMapping(path = "/call")
    public String getMethod() {
        System.out.println("get 호출입니다.");
        return "sssss";
    }

    @ApiOperation(value = "간략한 설명(제목)", notes = "상세설명.")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id"
                    , value = "아이디"
                    , dataType = "String"
                    , paramType = "path"
                    , example = "Try it out 클릭시 값 설정"
                    , defaultValue = "기본값 지정할때 사용"
                    , required = true)
    })
    @GetMapping(path = "/call/{id}")
    public String getCallPath(@PathVariable("id") String id) {
        System.out.println("get 호출입니다.");
        return "sssss";
    }

    @ApiOperation(value = "간략한 설명(제목)", notes = "상세설명.")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "nm"
                    , value = "이름"
                    , dataType = "string"
                    , paramType = "body"
                    , example = "jangwoosung"
                    , defaultValue = "기본값 지정할때 사용"
                    , required = true),
            @ApiImplicitParam(name = "age"
                    , value = "나이(111)"
                    , dataType = "long"
                    , paramType = "body"
                    , example = "11123121"
                    , defaultValue = "기본값 지정할때 사용"
                    , required = true)
    })
    @PostMapping(path = "/call")
    public String postCallInIgNore(@ApiIgnore @RequestBody User user) { //@ApiIgnore 안적으면 모델도 나타남
        System.out.println("get 호출입니다.");
        return "sssss";
    }

    @ApiOperation(value = "간략한 설명(제목)", notes = "상세설명.")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id"
                    , value = "아이디"
                    , dataType = "string"
                    , paramType = "path"
                    , example = "101"
                    , defaultValue = "기본값 지정할때 사용"
                    , required = true),
    })
    @PostMapping(path = "/call/{id}")
    public String postCallNotInIgnore(@RequestBody User user, @PathVariable("id") String id) { //@ApiIgnore 안적으면 모델도 나타남
        System.out.println("get 호출입니다.");
        return "sssss";
    }
}
