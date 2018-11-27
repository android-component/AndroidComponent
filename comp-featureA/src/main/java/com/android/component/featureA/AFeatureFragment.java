package com.android.component.featureA;

import com.me.ui.library.sample.FragmentBean;
import com.me.ui.library.sample.SampleListFragment;

import java.util.List;

/**
 * @author kylingo
 * @since 2018/11/27 15:21
 */
public class AFeatureFragment extends SampleListFragment {

    @Override
    protected void addItems(List<FragmentBean> items) {
        items.add(new FragmentBean("图片加载", ImageFragment.class));
    }
}
