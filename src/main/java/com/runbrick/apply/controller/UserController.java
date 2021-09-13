package com.runbrick.apply.controller;

import com.runbrick.apply.domain.entity.LoginBody;
import com.runbrick.apply.service.LoginService;
import com.runbrick.apply.util.Result;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * UserController 用户控制器
 *
 * @author chow
 * @since 1.8
 */
@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {

    LoginService loginService;

    /**
     * 登录
     *
     * @param loginBody LoginBody
     * @return Result
     */
    @RequestMapping(method = RequestMethod.POST)
    public Result login(@RequestBody LoginBody loginBody) {
        return null;
    }

    /**
     * 注册
     *
     * @param username String
     * @param password String
     * @param nickname String
     * @return Result
     */
    @RequestMapping(method = RequestMethod.POST, path = "register")
    public Result register(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            @RequestParam("nickname") String nickname
    ) {
        return loginService.doRegister(username, password, nickname);
    }
}
