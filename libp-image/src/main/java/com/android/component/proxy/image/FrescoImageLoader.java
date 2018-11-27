package com.android.component.proxy.image;

import android.content.Context;
import android.widget.ImageView;

import com.android.component.image.ImageDrawView;

/**
 * @author kylingo
 * @since 2018/11/27 14:48
 */
public class FrescoImageLoader implements ImageLoaderDelegate {

    @Override
    public void loadNetImage(ImageView imageView, String url) {
        if (imageView instanceof ImageDrawView) {
            ImageDrawView imageDrawView = (ImageDrawView) imageView;
            imageDrawView.setImageURI(url);
        }
    }

    @Override
    public void loadLocalImage(ImageView imageView, int resourceId) {
        if (imageView instanceof ImageDrawView) {
            Context context = imageView.getContext();
            String packageName = context.getPackageName();
            String url = "res:" + "//" + packageName + "/" + resourceId;

            ImageDrawView imageDrawView = (ImageDrawView) imageView;
            imageDrawView.setImageURI(url);
        }
    }
}
