package com.runbrick.apply.util;

/**
 * StringUtil 字符串处理类
 *
 * @author chow
 * @since 1.8
 */
public class StringUtils {


    /**
     * 判断对象是否为空
     *
     * @param o Object
     * @return true：为空 false：非空
     */
    public static boolean isNull(Object o) {
        return o == null;
    }

    /**
     * * 判断对象是否非空
     *
     * @param o Object
     * @return true：非空 false：空
     */
    public static boolean isNotNull(Object o) {
        return !isNull(o);
    }
}
