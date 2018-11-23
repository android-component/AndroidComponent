package com.android.component.library.util;

import android.content.Context;
import android.widget.Toast;

/**
 * @author kylingo
 * @since 2018/11/23 15:10
 */
public class ToastUtils {

    public static void show(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
