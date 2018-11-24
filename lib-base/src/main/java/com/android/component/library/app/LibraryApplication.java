package com.android.component.library.app;

import android.app.Application;

import com.android.component.library.router.RouterManager;

/**
 * @author kylingo
 * @since 2018/11/23 17:20
 */
public class LibraryApplication {

    private static boolean isInit;

    public static void onCreate(Application application) {
        if (isInit) {
            return;
        }

        isInit = true;
        RouterManager.init(application);
    }


}
