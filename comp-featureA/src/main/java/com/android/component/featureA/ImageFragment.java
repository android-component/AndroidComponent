package com.android.component.featureA;

import android.view.View;

import com.android.component.image.ImageDrawView;
import com.android.component.library.activity.BaseFragment;
import com.android.component.proxy.image.ImageLoaderUtils;

/**
 * @author kylingo
 * @since 2018/11/27 15:22
 */
public class ImageFragment extends BaseFragment {

    private static final String IMAGE_URL =
            "https://img.zcool.cn/community/01193959eeec64a801202b0c23804b.jpg@1280w_1l_2o_100sh.jpg";

    @Override
    protected int getContentViewId() {
        return R.layout.fragment_image;
    }

    @Override
    protected void initView(View view) {
        ImageDrawView imageDrawView = view.findViewById(R.id.iv_fragment_image);
        ImageLoaderUtils.loadNetImage(imageDrawView, IMAGE_URL);
    }
}
