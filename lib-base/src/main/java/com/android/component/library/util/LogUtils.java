package com.android.component.library.util;

import android.util.Log;

/**
 * @author kylingo
 * @since 2018/11/23 15:07
 */
public class LogUtils {

    public static void d(String tag, String msg) {
        Log.d(tag, msg);
    }

    public static void i(String tag, String msg) {
        Log.i(tag, msg);
    }

    public static void w(String tag, String msg) {
        Log.w(tag, msg);
    }

    public static void e(String tag, String msg) {
        Log.e(tag, msg);
    }
}
