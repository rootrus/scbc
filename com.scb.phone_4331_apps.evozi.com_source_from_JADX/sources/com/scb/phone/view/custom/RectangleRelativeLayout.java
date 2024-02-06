package com.scb.phone.view.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager$MediaBrowserCompat$ItemReceiver;

public class RectangleRelativeLayout extends RelativeLayout {
    private int MediaBrowserCompat$CustomActionResultReceiver = 0;
    private int MediaBrowserCompat$ItemReceiver = 1;

    public RectangleRelativeLayout(Context context) {
        super(context);
    }

    public RectangleRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RectangleRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        if (this.MediaBrowserCompat$CustomActionResultReceiver == 0) {
            if (this.MediaBrowserCompat$ItemReceiver > 1) {
                if (getMeasuredWidth() > 0) {
                    i3 = getMeasuredWidth() / this.MediaBrowserCompat$ItemReceiver;
                } else {
                    GridLayoutManager$MediaBrowserCompat$ItemReceiver gridLayoutManager$MediaBrowserCompat$ItemReceiver = (GridLayoutManager$MediaBrowserCompat$ItemReceiver) getLayoutParams();
                    i3 = (getContext().getResources().getDisplayMetrics().widthPixels - ((gridLayoutManager$MediaBrowserCompat$ItemReceiver.leftMargin + gridLayoutManager$MediaBrowserCompat$ItemReceiver.rightMargin) << 1)) / 3;
                }
                this.MediaBrowserCompat$CustomActionResultReceiver = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            } else {
                this.MediaBrowserCompat$CustomActionResultReceiver = i;
            }
        }
        super.onMeasure(i, this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public void setSpanSize(int i) {
        this.MediaBrowserCompat$ItemReceiver = i;
        requestLayout();
    }
}
