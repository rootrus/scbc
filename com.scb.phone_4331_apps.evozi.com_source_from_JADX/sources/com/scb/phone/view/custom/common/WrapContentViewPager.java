package com.scb.phone.view.custom.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p040o.onCheckBoxClick;

public class WrapContentViewPager extends NonSwipeableViewPager {
    public int IconCompatParcelizer = 0;

    public WrapContentViewPager(Context context) {
        super(context);
    }

    public WrapContentViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        try {
            View childAt = getChildAt(this.IconCompatParcelizer);
            if (childAt != null) {
                childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                i2 = View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824);
            }
        } catch (Exception e) {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver(e, "WrapContentViewPager onMeasureException", new Object[0]);
        }
        super.onMeasure(i, i2);
    }
}
