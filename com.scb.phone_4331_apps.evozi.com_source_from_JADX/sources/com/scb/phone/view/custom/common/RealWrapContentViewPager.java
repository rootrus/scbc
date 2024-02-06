package com.scb.phone.view.custom.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager$MediaBrowserCompat$MediaItem;
import p040o.onCheckBoxClick;

public class RealWrapContentViewPager extends NonSwipeableViewPager {
    private ViewPager.MediaMetadataCompat read;

    public RealWrapContentViewPager(Context context) {
        super(context);
    }

    public RealWrapContentViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        try {
            View childAt = getChildAt(getCurrentItem());
            if (childAt != null) {
                childAt.measure(i, i2);
                setMeasuredDimension(getDefaultSize(0, i), childAt.getMeasuredHeight());
                return;
            }
            super.onMeasure(i, i2);
        } catch (Exception e) {
            onCheckBoxClick.IconCompatParcelizer(e, "WrapContentViewPager onMeasureException", new Object[0]);
            super.onMeasure(i, i2);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C58263 r0 = new ViewPager$MediaBrowserCompat$MediaItem() {
            public final void onPageSelected(int i) {
                RealWrapContentViewPager.this.requestLayout();
            }
        };
        this.read = r0;
        addOnPageChangeListener(r0);
    }

    public void onDetachedFromWindow() {
        removeOnPageChangeListener(this.read);
        this.read = null;
        super.onDetachedFromWindow();
    }
}
