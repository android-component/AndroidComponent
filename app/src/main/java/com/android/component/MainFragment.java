package com.android.component;

import com.alibaba.android.arouter.launcher.ARouter;
import com.me.ui.library.sample.SampleFragment;

import java.util.List;

/**
 * @author kylingo
 * @since 2018/11/23 16:26
 */
public class MainFragment extends SampleFragment<String> {

    @Override
    protected void addItems(List<String> items) {
        items.add("FeatureA");
        items.add("FeatureB");
    }

    @Override
    protected void onClickItem(String item) {
        switch (item) {
            case "FeatureA":
                ARouter.getInstance().build("/a/featureA").navigation();
                break;
            case "FeatureB":
                ARouter.getInstance().build("/b/featureB").navigation();
                break;
        }
    }
}
