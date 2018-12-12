package com.example.library.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;

import com.example.library.R;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2018/12/12
 *     desc   : 状态栏相关工具类
 * </pre>
 */


public class StatusBarUtils {

    /***
     * * 状态栏的显示和隐藏
     * @param activity
     * @param hide 根据hide的boolean值来决定状态栏的隐藏和显示
     */
    public static void hideStatusBar(Activity activity,boolean hide,int color) {
        if (Build.VERSION.SDK_INT >= 22) {
            View decorView = activity.getWindow().getDecorView();
            if (hide) {
                decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
                activity.getWindow().setStatusBarColor(Color.TRANSPARENT);
            }else{
                decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_VISIBLE);
                activity.getWindow().setStatusBarColor(color);
            }

        }
    }
    /**
     * 获取系统状态栏高度
     * @param context
     * @return 状态栏高度
     */
    public static int getStatusBarHeight(Context context) {
        int statusBarHeight = 0;
        Resources res = context.getResources();
        int resourceId = res.getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            statusBarHeight = res.getDimensionPixelSize(resourceId);
        }
        return statusBarHeight;
    }
}
