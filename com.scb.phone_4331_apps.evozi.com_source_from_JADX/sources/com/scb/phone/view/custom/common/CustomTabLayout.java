package com.scb.phone.view.custom.common;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import p040o.onActivityCreated;

public class CustomTabLayout extends TabLayout {
    public CustomTabLayout(Context context) {
        super(context);
    }

    public CustomTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        super.setupWithViewPager(viewPager);
        Typeface createFromAsset = Typeface.createFromAsset(getContext().getAssets(), "fonts/db_heavent_regular.ttf");
        if (createFromAsset != null) {
            MediaBrowserCompat$CustomActionResultReceiver();
            ViewGroup viewGroup = (ViewGroup) getChildAt(0);
            onActivityCreated adapter = viewPager.getAdapter();
            int count = adapter != null ? adapter.getCount() : 0;
            for (int i = 0; i < count; i++) {
                IconCompatParcelizer(write().read(adapter.getPageTitle(i)));
                AppCompatTextView appCompatTextView = (AppCompatTextView) ((ViewGroup) viewGroup.getChildAt(i)).getChildAt(1);
                appCompatTextView.setTypeface(createFromAsset, 1);
                appCompatTextView.setAllCaps(true);
            }
        }
    }
}
