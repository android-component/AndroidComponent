package com.android.component.featureB;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.android.component.library.router.RouterScheme;

@Route(path = RouterScheme.PAGE.FEATURE_B)
public class BFeatureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature_b);
        setTitle(R.string.b_feature_name);
    }
}
