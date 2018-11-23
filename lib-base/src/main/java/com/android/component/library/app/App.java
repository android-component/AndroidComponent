package com.android.component.library.app;

import android.app.Application;
import android.content.Context;

import com.android.component.library.util.LogUtils;

public class App {
    private static final String TAG = "App";
    private static final Application INSTANCE;

    static {
        Application app = null;
        try {
            app = (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication").invoke(null);
            if (app == null)
                throw new IllegalStateException("Static initialization of Applications must be on main thread.");
        } catch (final Exception e) {
            LogUtils.e(TAG, "Failed to get current application from AppGlobals." + e.getMessage());
            try {
                app = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication").invoke(null);
            } catch (final Exception ex) {
                LogUtils.e(TAG, "Failed to get current application from ActivityThread." + e.getMessage());
            }
        } finally {
            INSTANCE = app;
        }
    }

    public static Context getContext() {
        return INSTANCE.getApplicationContext();
    }
}