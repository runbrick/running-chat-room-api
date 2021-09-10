package com.runbrick.apply.controller;

import com.runbrick.apply.domain.entity.LoginBody;
import com.runbrick.apply.util.Result;
import org.springframework.web.bind.annotation.*;

/**
 * UserController 用户控制器
 *
 * @author chow
 * @since 1.8
 */
@RestController
public class UserController {

    /**
     * 登录
     * @param loginBody
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public Result login(@RequestBody LoginBody loginBody) {
        return null;
    }

    /**
     * 注册
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public Result register(
            @RequestParam("username") String username,
            @RequestParam("password") String password
    ) {
        return null;
    }
}
