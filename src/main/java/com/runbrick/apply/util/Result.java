package com.runbrick.apply.util;

import com.runbrick.apply.constant.HttpCode;
import lombok.NoArgsConstructor;

import java.util.HashMap;

/**
 * Result ajax返回
 *
 * @author chow
 * @since 1.8
 */
@NoArgsConstructor
public class Result extends HashMap<String, Object> {

    private static final long serialVersionUID = 362498820763181264L;

    public Result(int code, String msg, Object data) {
        super.put("code", code);
        super.put("message", msg);
        if (StringUtils.isNotNull(data)) {
            super.put("data", data);
        }
    }


    public static Result success(String msg, Object data) {
        return new Result(HttpCode.SUCCESS, msg, data);
    }

    public static Result success(String msg) {
        return Result.success(msg, null);
    }

    public static Result success(Object data) {
        return Result.success("操作成功", data);
    }


    public static Result fail(int code, String msg) {
        return new Result(HttpCode.SUCCESS, msg, null);
    }

    public static Result fail(String msg) {
        return new Result(HttpCode.FAIL, msg, null);
    }
}
