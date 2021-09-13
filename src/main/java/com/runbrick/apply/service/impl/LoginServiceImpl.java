package com.runbrick.apply.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.runbrick.apply.domain.UserDO;
import com.runbrick.apply.mapper.UserDOMapper;
import com.runbrick.apply.service.LoginService;
import com.runbrick.apply.util.DateUtils;
import com.runbrick.apply.util.Result;
import com.runbrick.apply.util.SecurityUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * LoginServiceImpl 登录实例类
 *
 * @author chow
 * @since 1.8
 */
@Service
@AllArgsConstructor
public class LoginServiceImpl implements LoginService {

    UserDOMapper UserDOMapper;

    /**
     * 执行注册
     */
    @Override
    public Result doRegister(String username, String password, String nickname) {
        // 判断该用户是否注册过
        Long username1 = UserDOMapper.selectCount(new QueryWrapper<UserDO>().eq("username", username));
        if (username1 > 0L) {
            return Result.fail("注册失败，该用户已经存在");
        }
        UserDO userDO = new UserDO();
        userDO.setCreateTime(DateUtils.currentDate());
        userDO.setUsername(username);
        userDO.setPassword(SecurityUtils.encryptPassword(password));
        userDO.setRole("ROLE_USER"); // 用户注册强制写入用户权限
        userDO.setNickname(nickname);
        int insert = UserDOMapper.insert(userDO);
        return Result.success(insert == 1 ? "注册成功" : "注册失败");
    }
}
