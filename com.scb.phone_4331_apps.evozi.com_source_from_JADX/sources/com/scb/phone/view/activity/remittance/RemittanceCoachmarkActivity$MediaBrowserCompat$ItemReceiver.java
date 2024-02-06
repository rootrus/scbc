package com.scb.phone.view.activity.remittance;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.view.adapter.creditcard.CoachMarkViewPagerAdapter;
import p040o.onActivityCreated;
import p040o.onGetStartedClick;

final class RemittanceCoachmarkActivity$MediaBrowserCompat$ItemReceiver implements CoachMarkViewPagerAdapter.read {
    private /* synthetic */ RemittanceCoachmarkActivity write;

    RemittanceCoachmarkActivity$MediaBrowserCompat$ItemReceiver(RemittanceCoachmarkActivity remittanceCoachmarkActivity) {
        this.write = remittanceCoachmarkActivity;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(View view) {
        ViewPager viewPager = this.write.viewPager;
        if (viewPager == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewPager");
        }
        int currentItem = viewPager.getCurrentItem() + 1;
        ViewPager viewPager2 = this.write.viewPager;
        if (viewPager2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewPager");
        }
        onActivityCreated adapter = viewPager2.getAdapter();
        if (adapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        onGetStartedClick.IconCompatParcelizer((Object) adapter, "viewPager.adapter!!");
        if (currentItem < adapter.getCount()) {
            ViewPager viewPager3 = this.write.viewPager;
            if (viewPager3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewPager");
            }
            viewPager3.setCurrentItem(currentItem);
            return;
        }
        this.write.setResult(-1);
        this.write.finish();
    }
}
