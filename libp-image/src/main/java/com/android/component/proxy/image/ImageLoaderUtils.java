package com.android.component.proxy.image;

import android.widget.ImageView;

import com.android.component.provider.ImageLoaderDelegate;

/**
 * @author kylingo
 * @since 2018/11/27 15:02
 */
public class ImageLoaderUtils {

    private static final ImageLoaderDelegate DEFAULT_DELEGATE = new FrescoImageLoader();
    private static ImageLoaderDelegate sImageLoader = DEFAULT_DELEGATE;

    public static void loadNetImage(ImageView imageView, String url) {
        sImageLoader.loadNetImage(imageView, url);
    }

    public static void loadLocalImage(ImageView imageView, int resourceId) {
        sImageLoader.loadLocalImage(imageView, resourceId);
    }
}
