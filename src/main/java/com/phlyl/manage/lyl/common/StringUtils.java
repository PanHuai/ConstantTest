package com.phlyl.manage.lyl.common;

/**
 * Created by 潘淮  on 2018/9/7.<br>
 */
public class StringUtils {
    /**
     * 判断是否为null 或者 空字符串
     */

    public static boolean isBlank(CharSequence cs) {
        if (cs != null && cs.length() != 0) {
            for(int i = 0; i < cs.length(); ++i) {
                if (!Character.isWhitespace(cs.charAt(i))) {
                    return false;
                }
            }
            return true;
        } else {
            return true;
        }
    }

    public static boolean isNotBlank(CharSequence cs) {
        return !isBlank(cs);
    }

}
