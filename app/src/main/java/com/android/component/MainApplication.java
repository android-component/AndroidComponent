package com.android.component;

import android.app.Application;

import com.android.component.library.app.LibraryApplication;

/**
 * @author kylingo
 * @since 2018/11/23 17:55
 */
public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        init(this);
    }

    private void init(Application application) {
        LibraryApplication.onCreate(application);
    }
}
