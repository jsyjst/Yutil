package com.example.library.utils;

import android.app.Activity;
import android.widget.Toast;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2018/12/11
 *     desc   : Toast工具
 * </pre>
 */


public class ToastUtils {
    /**
     * @param context Context
     * @param string  内容
     */
    public static void show(final Activity context, final String string) {
        //判断是否为主线程
        if ("main".equals(Thread.currentThread().getName())) {
            Toast.makeText(context, string, Toast.LENGTH_SHORT).show();
        } else {//如果不是，就用该方法使其在ui线程中运行
            context.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(context, string, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
