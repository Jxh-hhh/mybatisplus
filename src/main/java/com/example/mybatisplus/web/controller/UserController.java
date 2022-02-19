package com.example.mybatisplus.web.controller;

import com.example.mybatisplus.common.utls.SessionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.mybatisplus.common.JsonResponse;
import com.example.mybatisplus.service.UserService;
import com.example.mybatisplus.model.domain.User;


/**
 *
 *  前端控制器
 *
 *
 * @author jxh
 * @since 2022-02-17
 * @version v1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger( UserController.class );

    @Autowired
    private UserService userService;

    /**
     * 登录请求，用户正确存入session
     * @param user
     * @return
     */
    @GetMapping("/login")
    @ResponseBody
    public JsonResponse login(User user) {
        User res = userService.login(user);
        if(res != null){
            SessionUtils.saveCurrentUserInfo(res);
        }
        return JsonResponse.success(res);
    }
}

