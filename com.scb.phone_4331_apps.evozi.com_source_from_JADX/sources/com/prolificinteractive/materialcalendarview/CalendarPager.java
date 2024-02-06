package com.prolificinteractive.materialcalendarview;

import android.content.Context;
import android.view.MotionEvent;
import androidx.core.view.BetterViewPager;

class CalendarPager extends BetterViewPager {
    private boolean pagingEnabled = true;

    public CalendarPager(Context context) {
        super(context);
    }

    public void setPagingEnabled(boolean z) {
        this.pagingEnabled = z;
    }

    public boolean isPagingEnabled() {
        return this.pagingEnabled;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.pagingEnabled && super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.pagingEnabled && super.onTouchEvent(motionEvent);
    }

    public boolean canScrollVertically(int i) {
        return this.pagingEnabled && super.canScrollVertically(i);
    }

    public boolean canScrollHorizontally(int i) {
        return this.pagingEnabled && super.canScrollHorizontally(i);
    }
}
