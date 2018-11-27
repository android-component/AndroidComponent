package com.android.component.image;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;


/**
 * @author kylingo
 * @since 2018/11/23 17:20
 */
public class ImageApplication {

    private static boolean isInit;

    public static void onCreate(Application application) {
        if (isInit) {
            return;
        }

        isInit = true;

        Fresco.initialize(application);
    }
}
