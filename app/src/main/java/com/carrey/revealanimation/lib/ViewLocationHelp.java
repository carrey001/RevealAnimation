package com.carrey.revealanimation.lib;

import android.view.View;

import java.io.Serializable;

/**
 * 类描述：
 * 创建人：carrey
 * 创建时间：2015/11/16 17:10
 */

public class ViewLocationHelp implements Serializable {
    int mSourceLeft;
    int mSourceTop;
    int mSourceWidth;
    int mSourceHeight;
    String mImageUrl;

    public ViewLocationHelp(View sourceView, String url) {
        int location[] = new int[2];
        sourceView.getLocationOnScreen(location);
        this.mSourceLeft = location[0];
        this.mSourceTop = location[1];
        this.mSourceWidth = sourceView.getWidth();
        this.mSourceHeight = sourceView.getHeight();
        this.mImageUrl = url;
    }

    public int measureLeft(int targetLeft) {
        return mSourceLeft - targetLeft;
    }

    public int measureTop(int taregetTop) {

        return mSourceTop - taregetTop;
    }

    public float measureScaleX(int width) {
        return mSourceWidth * 1.0f / width;
    }

    public float measureScaleY(int height) {
        return mSourceHeight * 1.0f / height;
    }
}
