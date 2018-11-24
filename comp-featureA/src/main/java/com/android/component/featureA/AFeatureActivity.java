package com.android.component.featureA;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.android.component.library.router.RouterScheme;

@Route(path = RouterScheme.PAGE.FEATURE_A)
public class AFeatureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature_a);
        setTitle(R.string.a_feature_name);
    }
}
