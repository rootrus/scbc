package com.scb.phone.view.activity.transferandpay.cardlessatm;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.view.adapter.creditcard.CoachMarkViewPagerAdapter;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.activity.transferandpay.cardlessatm.CardlessATMCoachMarkActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C5721xb2fc1972 implements CoachMarkViewPagerAdapter.read {
    private /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ CardlessATMCoachMarkActivity MediaBrowserCompat$ItemReceiver;

    C5721xb2fc1972(CardlessATMCoachMarkActivity cardlessATMCoachMarkActivity, int i) {
        this.MediaBrowserCompat$ItemReceiver = cardlessATMCoachMarkActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(View view) {
        ViewPager viewPager = this.MediaBrowserCompat$ItemReceiver.viewpage;
        if (viewPager == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewpage");
        }
        int currentItem = viewPager.getCurrentItem() + 1;
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (currentItem < i) {
            ViewPager viewPager2 = this.MediaBrowserCompat$ItemReceiver.viewpage;
            if (viewPager2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewpage");
            }
            viewPager2.setCurrentItem(currentItem);
        } else if (i == currentItem) {
            CardlessATMCoachMarkActivity.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
            this.MediaBrowserCompat$ItemReceiver.finish();
        }
    }
}
