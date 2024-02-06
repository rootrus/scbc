package com.scb.phone.view.custom.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;

public class CustomScrollView extends NestedScrollView {
    private boolean read = true;

    public void setEnableScrolling(boolean z) {
        this.read = z;
    }

    public CustomScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CustomScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomScrollView(Context context) {
        super(context);
    }

    public void scrollBy(int i, int i2) {
        if (this.read) {
            super.scrollBy(i, i2);
        }
    }

    public void scrollTo(int i, int i2) {
        if (this.read) {
            super.scrollTo(i, i2);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.read) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.read) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
