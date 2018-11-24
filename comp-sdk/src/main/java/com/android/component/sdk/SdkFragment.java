package com.android.component.sdk;

import com.android.component.library.router.RouterManager;
import com.me.ui.library.sample.SampleFragment;

import java.util.List;

/**
 * @author kylingo
 * @since 2018/11/23 16:26
 */
public class SdkFragment extends SampleFragment<String> {

    @Override
    protected void addItems(List<String> items) {
        items.add("FeatureA");
        items.add("FeatureB");
    }

    @Override
    protected void onClickItem(String item) {
        switch (item) {
            case "FeatureA":
                RouterManager.navigationFeatureA();
                break;
            case "FeatureB":
                RouterManager.navigationFeatureB();
                break;
        }
    }
}
