package com.android.component.library.app;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.android.component.library.BuildConfig;

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
        initARouter(application);
    }

    private static void initARouter(Application application) {
        // ARouter onCreate
        if (BuildConfig.DEBUG) {
            ARouter.openDebug();
            ARouter.openLog();
            ARouter.printStackTrace();
        }
        ARouter.init(application);
    }
}
