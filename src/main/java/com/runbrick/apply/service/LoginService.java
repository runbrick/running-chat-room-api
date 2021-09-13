package com.runbrick.apply.service;

import com.runbrick.apply.util.Result;

public interface LoginService {

    Result doRegister(String username, String password, String nickname);
}
