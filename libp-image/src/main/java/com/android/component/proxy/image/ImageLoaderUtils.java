package com.android.component.proxy.image;

import android.widget.ImageView;

/**
 * @author kylingo
 * @since 2018/11/27 15:02
 */
public class ImageLoaderUtils {

    private static final ImageLoaderDelegate DEFAULT_DELEGATE = new FrescoImageLoader();
    private static ImageLoaderDelegate sImageLoader = DEFAULT_DELEGATE;

    /**
     * 上层注入图片加载实现类
     */
    public static void setImageLoaderDelegate(ImageLoaderDelegate imageLoaderDelegate) {
        sImageLoader = imageLoaderDelegate;
    }

    public static void loadNetImage(ImageView imageView, String url) {
        sImageLoader.loadNetImage(imageView, url);
    }

    public static void loadLocalImage(ImageView imageView, int resourceId) {
        sImageLoader.loadLocalImage(imageView, resourceId);
    }
}
