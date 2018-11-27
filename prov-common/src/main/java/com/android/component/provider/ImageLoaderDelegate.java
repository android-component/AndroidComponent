package com.android.component.provider;

import android.widget.ImageView;

/**
 * @author kylingo
 * @since 2018/11/27 14:40
 */
public interface ImageLoaderDelegate {

    void loadNetImage(ImageView imageView, String url);

    void loadLocalImage(ImageView imageView, int resourceId);
}
