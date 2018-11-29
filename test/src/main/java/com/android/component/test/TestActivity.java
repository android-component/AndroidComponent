package com.android.component.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.android.component.library.util.LogUtils;

public class TestActivity extends AppCompatActivity {

    private static final String TAG = "TestActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        LogUtils.i(TAG, "onCreate:" + getString(R.string.lib_base));
        Toast.makeText(this, getString(R.string.lib_base), Toast.LENGTH_SHORT).show();
    }
}
