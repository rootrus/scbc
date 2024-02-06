package com.scb.phone.view.custom.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class NoSwipeViewPager extends ViewPager {
    private boolean write = true;

    public NoSwipeViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.write && super.onTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.write && super.onInterceptTouchEvent(motionEvent);
    }

    public void setPagingEnabled(boolean z) {
        this.write = z;
    }
}
