package com.android.component.featureA;

import android.support.v4.app.Fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.android.component.library.router.RouterScheme;
import com.me.ui.library.sample.SampleActivity;

@Route(path = RouterScheme.PAGE.FEATURE_A)
public class AFeatureActivity extends SampleActivity {

    @Override
    protected String getSampleTitle() {
        return getString(R.string.a_feature_name);
    }

    @Override
    protected Fragment getSampleFragment() {
        return new AFeatureFragment();
    }
}
