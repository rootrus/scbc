package com.scb.phone.view.custom.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class NonSwipeableViewPager extends ViewPager {
    private boolean MediaBrowserCompat$ItemReceiver = false;

    public NonSwipeableViewPager(Context context) {
        super(context);
    }

    public NonSwipeableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setDisableSwiping(boolean z) {
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public boolean canScrollHorizontally(int i) {
        if (this.MediaBrowserCompat$ItemReceiver) {
            return false;
        }
        return super.canScrollHorizontally(i);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.MediaBrowserCompat$ItemReceiver) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.MediaBrowserCompat$ItemReceiver) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
