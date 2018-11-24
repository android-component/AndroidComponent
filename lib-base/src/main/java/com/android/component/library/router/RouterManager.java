package com.android.component.library.router;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.android.component.library.BuildConfig;

/**
 * @author tangqi
 * @since 2018/11/24 23:45
 */
public class RouterManager {

    public static void init(Application application) {
        // ARouter onCreate
        if (BuildConfig.DEBUG) {
            ARouter.openDebug();
            ARouter.openLog();
            ARouter.printStackTrace();
        }
        ARouter.init(application);
    }

    public static void navigationFeatureA() {
        ARouter.getInstance().build(RouterScheme.PAGE.FEATURE_A).navigation();
    }

    public static void navigationFeatureB() {
        ARouter.getInstance().build(RouterScheme.PAGE.FEATURE_B).navigation();
    }
}
