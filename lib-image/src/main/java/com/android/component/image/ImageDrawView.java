package com.android.component.image;

import android.content.Context;
import android.util.AttributeSet;

import com.facebook.drawee.view.SimpleDraweeView;

/**
 * @author kylingo
 * @since 2018/11/27 14:25
 */
public class ImageDrawView extends SimpleDraweeView {

    public ImageDrawView(Context context) {
        this(context, null);
    }

    public ImageDrawView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ImageDrawView(Context context, AttributeSet attrs, int defStyle) {
        this(context, attrs, defStyle, 0);
    }

    public ImageDrawView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
