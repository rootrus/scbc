package com.scb.phone.view.custom.common;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatImageView;

public class AdjustableImageView extends AppCompatImageView {
    private boolean MediaBrowserCompat$ItemReceiver;

    public AdjustableImageView(Context context) {
        super(context);
    }

    public AdjustableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AdjustableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setAdjustViewBounds(boolean z) {
        this.MediaBrowserCompat$ItemReceiver = z;
        super.setAdjustViewBounds(z);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onMeasure(i, i2);
        } else if (this.MediaBrowserCompat$ItemReceiver) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int size = View.MeasureSpec.getSize(i2);
            int size2 = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i);
            if (mode == 1073741824 && mode2 != 1073741824) {
                int i3 = (intrinsicWidth * size) / intrinsicHeight;
                if (write()) {
                    setMeasuredDimension(i3, size);
                } else {
                    setMeasuredDimension(Math.min(i3, size2), Math.min(size, size));
                }
            } else if (mode2 != 1073741824 || mode == 1073741824) {
                super.onMeasure(i, i2);
            } else {
                int i4 = (intrinsicHeight * size2) / intrinsicWidth;
                if (write()) {
                    setMeasuredDimension(size2, i4);
                } else {
                    setMeasuredDimension(Math.min(size2, size2), Math.min(i4, size));
                }
            }
        } else {
            super.onMeasure(i, i2);
        }
    }

    private boolean write() {
        ViewParent parent = getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            if (((ViewGroup) parent).shouldDelayChildPressedState()) {
                return true;
            }
            parent = parent.getParent();
        }
        return false;
    }
}
