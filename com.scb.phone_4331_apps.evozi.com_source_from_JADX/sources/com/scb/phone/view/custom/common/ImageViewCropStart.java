package com.scb.phone.view.custom.common;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public class ImageViewCropStart extends AppCompatImageView {
    public ImageViewCropStart(Context context) {
        super(context);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public ImageViewCropStart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public ImageViewCropStart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* access modifiers changed from: protected */
    public boolean setFrame(int i, int i2, int i3, int i4) {
        Matrix imageMatrix = getImageMatrix();
        Drawable drawable = getDrawable();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int abs = Math.abs(i3 - i);
        float abs2 = ((float) Math.abs(i4 - i2)) / ((float) intrinsicHeight);
        imageMatrix.setScale(abs2, abs2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        setImageMatrix(imageMatrix);
        return super.setFrame(i - (Math.round(abs2 * ((float) intrinsicWidth)) - abs), i2, i3, i4);
    }
}
