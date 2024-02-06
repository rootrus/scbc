package com.scb.phone.view.custom.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager$MediaBrowserCompat$MediaItem;
import p040o.onCheckBoxClick;

public class FragmentWrapContentViewPager extends NonSwipeableViewPager {
    private boolean read = false;

    public FragmentWrapContentViewPager(Context context) {
        super(context);
        addOnPageChangeListener(new ViewPager$MediaBrowserCompat$MediaItem() {
            public final void onPageSelected(int i) {
                FragmentWrapContentViewPager.this.requestLayout();
            }
        });
    }

    public FragmentWrapContentViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        addOnPageChangeListener(new ViewPager$MediaBrowserCompat$MediaItem() {
            public final void onPageSelected(int i) {
                FragmentWrapContentViewPager.this.requestLayout();
            }
        });
    }

    public void setEnableDrawDynamicViewHeight(boolean z) {
        this.read = z;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (getChildCount() > 0) {
            boolean z = View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE;
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getChildAt(0).getMeasuredHeight();
            int makeMeasureSpec = z ? View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824) : i;
            Object obj = null;
            try {
                if (getAdapter() != null) {
                    obj = getAdapter().instantiateItem((ViewGroup) this, getCurrentItem());
                }
                if (obj instanceof Fragment) {
                    i3 = read(((Fragment) obj).getView(), i);
                } else if (obj instanceof ViewGroup) {
                    i3 = read((ViewGroup) obj, i);
                } else {
                    i3 = read((View) obj, i);
                }
                super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight + i3, 1073741824));
            } catch (Exception e) {
                onCheckBoxClick.write((Throwable) e);
            }
        }
    }

    private int read(View view, int i) {
        if (view == null) {
            return 0;
        }
        if (this.read) {
            view.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            view.measure(0, 0);
        }
        return view.getMeasuredHeight();
    }
}
