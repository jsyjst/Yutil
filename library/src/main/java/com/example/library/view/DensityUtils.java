package com.example.library.view;

import android.view.ContextThemeWrapper;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2018/12/11
 *     desc   : 像素工具类
 * </pre>
 */

public class DensityUtils {
    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     *
     * @param context 上下文
     * @param dpValue dp
     * @return px
     */
    public static int dip2px(ContextThemeWrapper context, float dpValue) {
        return (int) (dpValue * getDensity(context) + 0.5f);
    }
    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     *
     * @param context 上下文
     * @param pxValue px
     * @return dp
     */
    public static int px2dip(ContextThemeWrapper context, float pxValue) {
        return (int) (pxValue / getDensity(context) + 0.5f);
    }

    /**
     * 获取当前手机的屏幕像素密度
     *
     * @param context 上下文
     * @return 像素密度
     */

    public static float getDensity(ContextThemeWrapper context) {
        return context.getResources().getDisplayMetrics().density;
    }
}
