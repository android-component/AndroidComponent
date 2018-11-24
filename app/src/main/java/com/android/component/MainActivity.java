package com.android.component;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.android.component.sdk.SdkFragment;
import com.me.ui.library.sample.SampleActivity;

public class MainActivity extends SampleActivity {

    @Override
    protected String getSampleTitle() {
        return getString(R.string.app_name);
    }

    @Override
    protected Fragment getSampleFragment() {
        return new SdkFragment();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
