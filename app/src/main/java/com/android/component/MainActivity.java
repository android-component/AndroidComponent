package com.android.component;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.android.component.library.util.LogUtils;
import com.android.component.library.util.ToastUtils;
import com.me.ui.library.sample.SampleActivity;

public class MainActivity extends SampleActivity {

    @Override
    protected String getSampleTitle() {
        return getString(R.string.app_name);
    }

    @Override
    protected Fragment getSampleFragment() {
        return new MainFragment();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogUtils.i("MainActivity", getString(R.string.a_feature_name));
        ToastUtils.show(this, getString(R.string.lib_base));
    }
}
