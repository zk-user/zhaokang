package com.example.controller;


import com.example.domain.Result;
import com.example.domain.ResultCodeEnum;
import com.example.domain.ResultInfo;
import com.example.domain.Status;
import com.example.entity.User;
import com.example.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.ResultSet;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author astupidcoder
 * @since 2021-01-28
 */
@Api(tags = "用户信息")
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    IUserService userService;

    @ApiOperation("查询所有用户")
    @PostMapping("/query")
    public Result findAllUser(){
      return Result.ok().success(true).code(20000).data("user",userService.findAllUser());
    }

    @ApiOperation("添加用户")
    @PostMapping("/insert")
    public Result insertUser(@RequestBody User user){
        userService.insertUser(user);
        return Result.ok();
    }

    @ApiOperation("删除用户")
    @PostMapping("/delete/{id}")
    public Result deleteUser(@PathVariable String id){
        userService.deleteUser(id);
        return Result.ok();
    }
}
