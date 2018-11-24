package com.android.component.sdk;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.alibaba.android.arouter.launcher.ARouter;
import com.me.ui.library.sample.SampleActivity;

public class SdkActivity extends SampleActivity {

    @Override
    protected String getSampleTitle() {
        return getString(R.string.sdk_name);
    }

    @Override
    protected Fragment getSampleFragment() {
        return new SdkFragment();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initARouter();

        ARouter.getInstance().inject(this);
    }

    private void initARouter() {

    }
}
