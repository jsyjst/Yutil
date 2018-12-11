package com.example.library.utils;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2018/12/11
 *     desc   : 数据检查
 * </pre>
 */


public class DataCheck {
    /**
     * 验证密码是否符合规则（6到16位的数字或者字母）
     * @param password		需要校验的密码
     * @return				true(正确)		false(不正确)
     */

    public static boolean checkPassword(String password) {
        String regex = "[\\w]{6,16}";
        return password.matches(regex);
    }

    /**
     * 验证邮箱是否正确
     * @param email		邮箱地址
     * @return			true(正确)		false(不正确)
     */
    public static boolean checkMail(String email) {
        //数字或者字母或者_出现3到12次 @ 数字或者字母出现一次或多次 (.字母出现一次或多次)出现1次到5次
        String reg = "[\\w]{3,20}@[\\w&&[^_]]+(\\.[a-zA-Z]+){1,5}";
        return email.matches(reg);

    }
}
