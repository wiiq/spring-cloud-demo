package com.demo.controller;

import com.demo.model.TUser;
import com.demo.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by weiq on 2017/12/8.
 */
@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation(value="编辑用户", notes="")
    @ApiImplicitParam(name = "user", value = "用户实体user", required = true, dataType = "TUser")
    @RequestMapping(value = "/editUser", method = RequestMethod.POST )
    public String editUser(@RequestBody TUser user){
        TUser result = userService.editUserByJpa(user);
        return null != result ? result.toString() : "failed";
    }

    @ApiOperation(value="编辑用户保存到mongodb", notes="")
    @ApiImplicitParam(name = "user", value = "用户实体user", required = true, dataType = "TUser")
    @RequestMapping(value = "/editUserByMongo", method = RequestMethod.POST )
    public String editUserByMongo(@RequestBody TUser user){
        TUser result = userService.editUserByMongo(user);
        return null != result ? result.toString() : "failed";
    }


}
