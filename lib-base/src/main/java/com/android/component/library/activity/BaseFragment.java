package com.android.component.library.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.me.ui.library.sample.AbstractSampleFragment;

/**
 * @author kylingo
 * @since 2018/11/27 15:23
 */
public abstract class BaseFragment extends AbstractSampleFragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
