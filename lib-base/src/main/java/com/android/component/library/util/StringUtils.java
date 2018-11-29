package com.android.component.library.util;

import android.content.Context;

/**
 * @author kylingo
 * @since 2018/11/29 16:43
 */
public class StringUtils {
    public static String getString(Context context, int resourceId) {
        return context.getString(resourceId);
    }
}
